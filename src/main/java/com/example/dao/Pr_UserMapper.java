package com.example.dao;

import com.example.entity.Pr_User;

/**
 * @Author LJM
 * @Date 2021/7/26 20:32
 * @Version 1.0
 */
public interface Pr_UserMapper {
    /**
     * 管理员登录
     *
     * @param pr_username,pr_password
     * @return
     */
    Pr_User pr_login(String pr_username, String pr_password);
}
