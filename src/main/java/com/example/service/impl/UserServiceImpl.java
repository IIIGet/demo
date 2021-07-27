package com.example.service.impl;
import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findByAll() {
        return userMapper.findByAll();
    }

    @Override
    public User findUserById(Integer userid) {
        return userMapper.findUserById(userid);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public int deleteUser(Integer userid) {
        return userMapper.deleteUser(userid);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User loginIn(String username,String password) {
        return userMapper.loginIn(username,password);
    }

}
