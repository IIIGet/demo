package com.example.service;

import com.example.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailService {
    List<GoodsDetail> getAll();
    List<GoodsDetail> order();
}
