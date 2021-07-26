package com.example.service.impl;

import com.example.dao.OrderMapper;
import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;



    @Override
    public Order findOrder1() {
        System.out.println("222");
        return orderMapper.findOrder1();
    }

    @Override
    public List<Order> findOrder() {
        System.out.println("333");
        return orderMapper.findOrder();
    }
}
