package com.example.dao;

import com.example.entity.GoodsDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface GoodsDetailMapper {
    List<GoodsDetail> getAll();
    List<GoodsDetail> order();
}
