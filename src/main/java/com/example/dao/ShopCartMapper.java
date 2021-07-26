package com.example.dao;

import com.example.entity.ShopCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopCartMapper {
    int upShop(String orderNum);

    int insertShop(Integer userId,Integer gId);
    int getOrderNum();
}
