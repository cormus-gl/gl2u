package com.goodluck2u.gl2u.service.serviceImpl;

import com.goodluck2u.gl2u.common.DateUtil;
import com.goodluck2u.gl2u.common.InfluxDBUtil;
import com.goodluck2u.gl2u.common.TimeRange;
import com.goodluck2u.gl2u.config.InfluxDBConfig;
import com.goodluck2u.gl2u.dao.StockMapper;
import com.goodluck2u.gl2u.dao.UserStockTradeLogMapper;
import com.goodluck2u.gl2u.entity.*;
import com.goodluck2u.gl2u.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockServiceImpl implements StockService{

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private UserStockTradeLogMapper userStockTradeLogMapper;

    @Override
    public List<Stock> getStock(String userId) {
        List<Stock> stockList = null;
        if ("".equals(userId)){
            StockExample stockExample = new StockExample();
            stockList = stockMapper.selectByExample(stockExample);
        } else {
            stockList = stockMapper.selectUserHoldStockList(userId);
        }
        return stockList;
    }

    @Override
    public List<UserStockTradeLog> getStockTradeLogs(String userId) {
        UserStockTradeLogExample userStockTradeLogExample = new UserStockTradeLogExample();
        UserStockTradeLogExample.Criteria criteria = userStockTradeLogExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UserStockTradeLog> logList = userStockTradeLogMapper.selectByExample(userStockTradeLogExample);
        return logList;
    }

    @Override
    public List<StockPriceDetail> getStockPriceList(String stockNum, TimeRange dateRange) {
        String sql = String.format("select * from stock where stocknum='%s' and time > %s", stockNum, DateUtil.getTimeRange(dateRange));
        InfluxDBUtil influxDBUtil = new InfluxDBConfig().getInfluxDB();

        return influxDBUtil.getStockPriceList(sql);
    }

    @Override
    public void stockTrade(String userId, String stockNum, int tradeNum) {

    }
}
