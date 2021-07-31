package com.example.service.impl;


import com.example.dao.UsersMapper;

import com.example.entity.Users;
import com.example.service.OrderService;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users findusers() {
        return usersMapper.findusers();
    }

}
