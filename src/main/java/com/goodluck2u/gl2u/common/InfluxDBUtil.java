package com.goodluck2u.gl2u.common;

import com.goodluck2u.gl2u.entity.StockPriceDetail;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.influxdb.dto.Query;

import java.util.Date;
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

    public void getStockPriceList(){

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
