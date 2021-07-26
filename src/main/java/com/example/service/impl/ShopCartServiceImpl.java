package com.example.service.impl;

import com.example.dao.ShopCartMapper;
import com.example.entity.ShopCart;
import com.example.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    ShopCartMapper shopCartMapper;

    @Override
    public int upShop(String orderNum) {
        return shopCartMapper.upShop(orderNum);
    }

    @Override
    public int insertShop(Integer userId,Integer gId) {
        return shopCartMapper.insertShop(userId, gId);
    }

    @Override
    public int getOrderNum() {
        return shopCartMapper.getOrderNum();
    }


}
