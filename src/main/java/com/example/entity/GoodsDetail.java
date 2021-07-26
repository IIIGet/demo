package com.example.entity;

public class GoodsDetail {
    private Integer gId;
    private String gName;
    private float gPrice;
    private float gPriceVip;
    private String gText;
    private Integer orderNum;

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgText() {
        return gText;
    }

    public void setgText(String gText) {
        this.gText = gText;
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

    public float getgPriceVip() {
        return gPriceVip;
    }

    public void setgPriceVip(float gPriceVip) {
        this.gPriceVip = gPriceVip;
    }
}
