package com.example.entity;



public class Order {
    private int userid;
    private String username;
    private int gId;
    private String gName;
    private float gPrice;
    private int orderNum;


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
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

