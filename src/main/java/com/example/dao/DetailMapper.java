package com.example.dao;

import com.example.entity.Detail;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface DetailMapper {
    int insertDetail(Detail detail);
}
