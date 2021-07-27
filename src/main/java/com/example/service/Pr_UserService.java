package com.example.service;

import com.example.entity.Pr_User;
import org.springframework.stereotype.Service;

/**
 * @Author LJM
 * @Date 2021/7/26 20:36
 * @Version 1.0
 */

public interface Pr_UserService {
    Pr_User pr_login(String pr_username, String pr_password);
}
