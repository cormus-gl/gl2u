package com.goodluck2u.gl2u.entity;

import java.util.Date;

public class Stock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.ID
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.NAME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.STOCK_NUM
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private String stockNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.INCREASE_YESTERDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Double increaseYesterday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.INCREASE_LAST_THREEDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Double increaseLastThreeday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.INCREASE_LAST_WEEK
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Double increaseLastWeek;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.INCREASE_LAST_MONTH
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Double increaseLastMonth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.INCREASE_LAST_HALF_YEAR
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Double increaseLastHalfYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.CREATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock.UPDATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    private Date updatedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Stock(String id, String name, String stockNum, Double increaseYesterday, Double increaseLastThreeday, Double increaseLastWeek, Double increaseLastMonth, Double increaseLastHalfYear, Date createdTime, Date updatedTime) {
        this.id = id;
        this.name = name;
        this.stockNum = stockNum;
        this.increaseYesterday = increaseYesterday;
        this.increaseLastThreeday = increaseLastThreeday;
        this.increaseLastWeek = increaseLastWeek;
        this.increaseLastMonth = increaseLastMonth;
        this.increaseLastHalfYear = increaseLastHalfYear;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Stock() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.ID
     *
     * @return the value of stock.ID
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.ID
     *
     * @param id the value for stock.ID
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.NAME
     *
     * @return the value of stock.NAME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.NAME
     *
     * @param name the value for stock.NAME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.STOCK_NUM
     *
     * @return the value of stock.STOCK_NUM
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.STOCK_NUM
     *
     * @param stockNum the value for stock.STOCK_NUM
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.INCREASE_YESTERDAY
     *
     * @return the value of stock.INCREASE_YESTERDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Double getIncreaseYesterday() {
        return increaseYesterday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.INCREASE_YESTERDAY
     *
     * @param increaseYesterday the value for stock.INCREASE_YESTERDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setIncreaseYesterday(Double increaseYesterday) {
        this.increaseYesterday = increaseYesterday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.INCREASE_LAST_THREEDAY
     *
     * @return the value of stock.INCREASE_LAST_THREEDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Double getIncreaseLastThreeday() {
        return increaseLastThreeday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.INCREASE_LAST_THREEDAY
     *
     * @param increaseLastThreeday the value for stock.INCREASE_LAST_THREEDAY
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setIncreaseLastThreeday(Double increaseLastThreeday) {
        this.increaseLastThreeday = increaseLastThreeday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.INCREASE_LAST_WEEK
     *
     * @return the value of stock.INCREASE_LAST_WEEK
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Double getIncreaseLastWeek() {
        return increaseLastWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.INCREASE_LAST_WEEK
     *
     * @param increaseLastWeek the value for stock.INCREASE_LAST_WEEK
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setIncreaseLastWeek(Double increaseLastWeek) {
        this.increaseLastWeek = increaseLastWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.INCREASE_LAST_MONTH
     *
     * @return the value of stock.INCREASE_LAST_MONTH
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Double getIncreaseLastMonth() {
        return increaseLastMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.INCREASE_LAST_MONTH
     *
     * @param increaseLastMonth the value for stock.INCREASE_LAST_MONTH
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setIncreaseLastMonth(Double increaseLastMonth) {
        this.increaseLastMonth = increaseLastMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.INCREASE_LAST_HALF_YEAR
     *
     * @return the value of stock.INCREASE_LAST_HALF_YEAR
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Double getIncreaseLastHalfYear() {
        return increaseLastHalfYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.INCREASE_LAST_HALF_YEAR
     *
     * @param increaseLastHalfYear the value for stock.INCREASE_LAST_HALF_YEAR
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setIncreaseLastHalfYear(Double increaseLastHalfYear) {
        this.increaseLastHalfYear = increaseLastHalfYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.CREATED_TIME
     *
     * @return the value of stock.CREATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.CREATED_TIME
     *
     * @param createdTime the value for stock.CREATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock.UPDATED_TIME
     *
     * @return the value of stock.UPDATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock.UPDATED_TIME
     *
     * @param updatedTime the value for stock.UPDATED_TIME
     *
     * @mbg.generated Tue Mar 03 22:17:16 CST 2020
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}