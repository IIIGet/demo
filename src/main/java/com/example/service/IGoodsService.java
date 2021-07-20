package com.example.service;

import com.example.entity.Goods;

import java.util.List;

public interface IGoodsService {
    List<Goods> viewGoods();
    List<Goods> viewGoodsByKey(String gKey);
    List<Goods> viewGoodsById(int gId);
    void deleteGoods(int gId);
    void save(Goods goods);
    void change(Goods goods);

}
