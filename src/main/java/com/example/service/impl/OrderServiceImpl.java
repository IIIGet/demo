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
    public List<Order> findOrder() {
        return orderMapper.findOrder();
    }

    @Override
    public Order findOrder1() {
        return orderMapper.findOrder1();
    }

    @Override
    public int updateOrder(Order orders) {
        return 0;
    }


}
