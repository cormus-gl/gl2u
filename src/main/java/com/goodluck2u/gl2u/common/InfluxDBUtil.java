package com.goodluck2u.gl2u.common;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.goodluck2u.gl2u.entity.StockPriceDetail;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Data
@Slf4j
public class InfluxDBUtil {
    private String userName;
    private String password;
    private String url;
    public String database;
    private String retentionPolicy;
    // InfluxDB实例
    private InfluxDB influxDB;

    public InfluxDBUtil(String userName, String password, String url, String database,
                         String retentionPolicy) {
        this.userName = userName;
        this.password = password;
        this.url = url;
        this.database = database;
        this.retentionPolicy = retentionPolicy == null || "".equals(retentionPolicy) ? "autogen" : retentionPolicy;
        this.influxDB = influxDbBuild();
    }

    /**
     * 连接数据库 ，若不存在则创建
     *
     * @return influxDb实例
     */
    private InfluxDB influxDbBuild() {
        if (influxDB == null) {
            influxDB = InfluxDBFactory.connect(url, userName, password);
        }

        influxDB.setRetentionPolicy(retentionPolicy);
        influxDB.setLogLevel(InfluxDB.LogLevel.BASIC);
        return influxDB;
    }

    public List<StockPriceDetail> getStockPriceList(String sql){
        Query query = new Query(sql,database);
        QueryResult queryResult = influxDB.query(query, TimeUnit.MINUTES);
        List<QueryResult.Result> resultList =  queryResult.getResults();

        List<StockPriceDetail> stockPriceDetails = new ArrayList<>();
        for (QueryResult.Result result : resultList) {
            List<QueryResult.Series> seriesList = result.getSeries();
            for (QueryResult.Series series : seriesList) {
                StockPriceDetail stockPriceDetail = new StockPriceDetail();
                List<String> keys = series.getColumns();
                List<List<Object>> values = series.getValues();
                for (List<Object> value : values){
                    Map<String, String> beanMap = new HashMap<>();
                    for (int i = 0; i < keys.size(); i++) {
                        beanMap.put(keys.get(i), (String) value.get(i));
                    }
                    try {
                        BeanUtils.populate(stockPriceDetail, beanMap);
                    } catch (Exception e){
                        log.error(String.format("influx data select error %s", e));
                    }
                    stockPriceDetails.add(stockPriceDetail);
                }
            }

        }
        return stockPriceDetails;
    }

    public void insertStockData(){
        Point.Builder builder = Point.measurement("trackpoint");
        builder.time(System.currentTimeMillis(), TimeUnit.MINUTES);
        builder.addField("stocknum",100);
        builder.addField("price",2.31);
        Point point = builder.build();
        influxDB.setDatabase(database).write(point);
    }

}
