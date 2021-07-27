package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有的user信息
     *
     * @return
     */
    List<User> findByAll();
    /**
     * 根据id查找User信息
     *
     * @param userid
     * @return
     */
    User findUserById(Integer userid);

    /**
     * 保存user信息
     *
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 根据id删除某个user信息
     *
     * @param userid
     * @return
     */
    int deleteUser(Integer userid);

    /**
     * 更新user信息
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 登录
     *
     * @param username,password
     * @return
     */
    User loginIn(String username,String password);
}



