package com.example.service.impl;


import com.example.dao.DetailMapper;
import com.example.entity.Detail;
import com.example.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class DetailServiceImpl implements DetailService {
        @Autowired
        private  DetailMapper detailMapper;


    @Override
    public int insertDetail(Detail detail) {
        return detailMapper.insertDetail(detail);
    }
}

