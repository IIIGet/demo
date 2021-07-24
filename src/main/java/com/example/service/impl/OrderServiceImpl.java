package com.example.service.impl;

import com.example.dao.OrderMapper;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public int insertOrder(Integer userid, String username, Integer gId, String gName, float gPrice, Integer orderNum) {
        return orderMapper.insertOrder(userid,username,gId,gName,gPrice,orderNum);
    }
}
