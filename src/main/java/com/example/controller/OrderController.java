package com.example.controller;

import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



//@Controller 是返回页面，需要调用UserMapper，所以用@AutoWired
//自动注入UserMapper，return ”user“ 返回的是一个页面，所以需要创建一个
//user.jsp。

@Controller

public class OrderController {
    @Autowired
    private OrderService orderService;

    //查询所有order数据
    @RequestMapping("demo/userList")
    public String index(Model mod) {
        Order order = orderService.findOrder1();
        mod.addAttribute("order", order);
        System.out.println("111");
        return "demo/userList";
    }
}
