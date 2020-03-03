package com.goodluck2u.gl2u.entity;

import java.util.Date;

public class StockPriceDetail {

    private String stockNum;

    private double price;

    private Date currentTime;

    public StockPriceDetail(String stockNum, double price, Date currentTime) {
        this.stockNum = stockNum;
        this.price = price;
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        return "StockPriceDetail{" +
                "stockNum='" + stockNum + '\'' +
                ", price=" + price +
                ", currentTime=" + currentTime +
                '}';
    }
}
