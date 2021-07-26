package com.example.controller;

import com.example.entity.GoodsDetail;
import com.example.service.GoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GoodsDetailController {
    @Autowired
    private GoodsDetailService goodsDetailService;

    @RequestMapping("detail")
    public String getGName(Model model) {
        List<GoodsDetail> list = goodsDetailService.getAll();
        model.addAttribute("GoodsDetail", list);
        return "detail";
    }

    @RequestMapping("order")
    public String gText(Model model) {
        List<GoodsDetail> list = goodsDetailService.order();
        model.addAttribute("goods", list);
        return "order";
    }

}
