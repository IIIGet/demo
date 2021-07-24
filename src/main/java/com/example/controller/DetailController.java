package com.example.controller;

import com.example.entity.Detail;
import com.example.entity.Order;
import com.example.service.DetailService;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DetailController {
    @Autowired
    private DetailService detailService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/topaysucessful")
    public String topaysucessful(Model model,Order order,Detail detail){
        order = orderService.findOrder1();
        model.addAttribute("order",order);
        detail.setUsername(order.getUsername());
        System.out.println("userid:"+order.getOrderNum()*order.getgPrice());

        detail.setTotal(order.getgPrice()*order.getOrderNum());

        detail.setOrderNum(order.getOrderNum());
        detail.setgName(order.getgName());
        detail.setgId(order.getgId());
        detail.setUserid(order.getUserid());
        detailService.insertDetail(detail);
        System.out.println(detail.getOrderNum());
        System.out.println(detail.getgName());
        System.out.println(detail.getgId());
        System.out.println("detail的total"+detail.getTotal());
        return "paysucessful";

    }


}

