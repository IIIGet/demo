package com.example.entity;

import java.sql.Timestamp;

/**
 * @Author LJM
 * @Date 2021/7/20 17:59
 * @Version 1.0
 */
public class Order {
    private int userid;
    private int gld;
    private float gPrice;
    private int orderNum;
    private Timestamp orderTime;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getGld() {
        return gld;
    }

    public void setGld(int gld) {
        this.gld = gld;
    }

    public float getgPrice() {
        return gPrice;
    }

    public void setgPrice(float gPrice) {
        this.gPrice = gPrice;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
