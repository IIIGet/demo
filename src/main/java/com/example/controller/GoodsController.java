package com.example.controller;

import com.example.entity.Goods;
import com.example.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("viewGoods")//显示商品
    public String viewGoods(HttpServletRequest request){
        request.setAttribute("goods",goodsService.viewGoods());
        return "viewGoods";
    }

    @RequestMapping("save")//添加商品（管理员权限，浏览没有此功能）
    public String addGoods(HttpServletRequest request, Goods goods){
        goodsService.save(goods);
        return "addGoods";
    }

    @RequestMapping("deleteGoods")//删除商品（管理员权限，浏览没有此功能）
    public String deleteGoods(HttpServletRequest request,int gId){
        goodsService.deleteGoods(gId);
        request.setAttribute("goods",goodsService.viewGoods());
        return "viewGoods";
    }

    @RequestMapping("change")
    public String change(HttpServletRequest request,Goods goods){
        goodsService.change(goods);
        return "changeGoods";
    }

    @RequestMapping("viewGoodsByKey")//按类别显示商品
    public String viewGoodsByKey(HttpServletRequest request,String gKey){
        request.setAttribute("goods",goodsService.viewGoodsByKey(gKey));
        return "viewGoods";
    }

    @RequestMapping("changeGoods")//根据gId查找商品，跳转更改界面
    public String changeGoods(HttpServletRequest request,int gId){
        request.setAttribute("goods",goodsService.viewGoodsById(gId));
        return "changeGoods";
    }



    @RequestMapping("Login")//跳转登录页面
    public String gotoLogin() { return "login"; }

    @RequestMapping("addGoods")//跳转添加界面
    public String addGoods(){ return "addGoods"; }



}
