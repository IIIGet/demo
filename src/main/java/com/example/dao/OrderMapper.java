package com.example.dao;

import com.example.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findOrder();
    Order findOrder1();

}
