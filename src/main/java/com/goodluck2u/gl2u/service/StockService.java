package com.goodluck2u.gl2u.service;

import com.goodluck2u.gl2u.common.TimeRange;
import com.goodluck2u.gl2u.entity.Stock;
import com.goodluck2u.gl2u.entity.StockPriceDetail;
import com.goodluck2u.gl2u.entity.UserStockTradeLog;

import java.util.List;

public interface StockService {
    public List<Stock> getStock(String userId);

    public List<UserStockTradeLog> getStockTradeLogs(String userId);

    public List<StockPriceDetail> getStockPriceList(String stockNum, TimeRange dateRange);

    public void stockTrade(String userId, String stockNum, int tradeNum);
}
