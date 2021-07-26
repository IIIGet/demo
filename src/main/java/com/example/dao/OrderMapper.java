package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {


    int insertOrder(Integer userid, String username, Integer gId, String gName, float gPrice, Integer orderNum);
}
