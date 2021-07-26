package com.example.service;

public interface OrderService {
    int insertOrder(Integer userId, String username, Integer gId, String gName, float gPrice, Integer orderNum);
}
