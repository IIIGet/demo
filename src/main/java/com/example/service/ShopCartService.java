package com.example.service;

import com.example.entity.ShopCart;

import java.util.List;

public interface ShopCartService {
    int upShop(String orderNum);
    int insertShop(Integer userId,Integer gId);
    int getOrderNum();
}
