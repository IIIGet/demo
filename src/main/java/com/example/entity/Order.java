package com.example.entity;

import java.sql.Timestamp;

public class Order {
    private int userid;
    private int gId;
    private String gName;
    private String username;
    private float gPrice;
    private float gPriceNow;
    private int orderNum;
    private int orderId;
    private Timestamp orderTime;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getgPriceNow() {
        return gPriceNow;
    }

    public void setgPriceNow(float gPriceNow) {
        this.gPriceNow = gPriceNow;
    }
}

