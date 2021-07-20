package com.example.dao;


import com.example.entity.Goods;
import java.util.List;


public interface GoodsMapper {
    List<Goods> viewGoods();
    List<Goods> viewGoodsByKey(String gKey);
    List<Goods> viewGoodsById(int gId);
    void deleteGoods(int gId);
    void save(Goods goods);
    void change(Goods goods);
}
