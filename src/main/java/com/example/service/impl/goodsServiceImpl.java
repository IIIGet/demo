package com.example.service.impl;
import com.example.dao.GoodsMapper;
import com.example.entity.Goods;
import com.example.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class goodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> viewGoods() {
        return goodsMapper.viewGoods();
    }

    @Override
    public List<Goods> viewGoodsByKey(String gKey) {
        return goodsMapper.viewGoodsByKey(gKey);
    }

    @Override
    public List<Goods> viewGoodsById(int gId) { return goodsMapper.viewGoodsById(gId); }

    @Override
    public void deleteGoods(int gId) {
        goodsMapper.deleteGoods(gId);
    }

    @Override
    public void save(Goods goods) {
        goodsMapper.save(goods);
    }

    @Override
    public void change(Goods goods) { goodsMapper.change(goods); }
}
