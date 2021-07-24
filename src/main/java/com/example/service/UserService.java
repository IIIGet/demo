package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> findByAll();

    User findUserById(Integer userid);

    int saveUser(User user);

    int deleteUser(Integer userid);

    int updateUser(User user);

    User loginIn(String username,String password);
}
