package com.example.service.impl;

import com.example.dao.Pr_UserMapper;
import com.example.entity.Pr_User;
import com.example.service.Pr_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LJM
 * @Date 2021/7/26 20:38
 * @Version 1.0
 */
@Service
public class Pr_UserServiceImpl implements Pr_UserService {

    @Autowired
    private Pr_UserMapper prUserMapper;

    @Override
    public Pr_User pr_login(String pr_username, String pr_password) {
        return prUserMapper.pr_login(pr_username,pr_password);
    }
}
