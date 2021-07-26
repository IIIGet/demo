package com.example.controller;

import com.example.dao.ShopCartMapper;
import com.example.entity.GoodsDetail;
import com.example.entity.ShopCart;
import com.example.service.ShopCartService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping("insertS")
    public String insert(Integer userId, Integer gId) {
        shopCartService.insertShop(userId,gId);
        return "redirect:detail";
    }

    @RequestMapping("pNumber")
    public String up(String buyNumber) {
        shopCartService.upShop(buyNumber);
        return "redirect:detail";
    }
}
