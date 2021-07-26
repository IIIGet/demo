package com.example.service.impl;

import com.example.dao.GoodsDetailMapper;
import com.example.entity.GoodsDetail;
import com.example.service.GoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {
    @Autowired
    GoodsDetailMapper goodsDetailMapper;


    @Override
    public List<GoodsDetail> getAll() {
        return goodsDetailMapper.getAll();
    }

    @Override
    public List<GoodsDetail> order() {
        return goodsDetailMapper.order();
    }
}
