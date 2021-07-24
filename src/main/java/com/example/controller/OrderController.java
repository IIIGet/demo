package com.example.controller;

import com.example.entity.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

//@Controller 是返回页面，需要调用UserMapper，所以用@AutoWired
//自动注入UserMapper，return ”user“ 返回的是一个页面，所以需要创建一个
//user.jsp。

@Controller

public class OrderController {
    @Autowired
    private OrderService orderService;

    //查询所有order数据
    @RequestMapping("/userList")
    public String index(Model mod) {
        Order order = orderService.findOrder1();
        mod.addAttribute("order", order);
        return "userList";
    }



    @RequestMapping("/paysucessful")
    public String index1(Model model) {
        Order order = orderService.findOrder1();
        model.addAttribute("order", order);
        System.out.println(order.getgPrice()*order.getOrderNum());
        return "paysucessful";

    }

//    @RequestMapping("/")
//    public String toEdit( Model model){
//        Order order= orderService.updateOrder(order);
//
//
//
//        return "redirect:/";
//    }




    //默认访问list页面
    /*@RequestMapping("/")
    public String list2(Model mod) {
        return "findOrder";
    }*/
   /* @RequestMapping("/userList")
    public String list(Model mod){
        List<Order> list1 = orderService.findOrder();
        mod.addAttribute("orders", list1);
        return "redirect:/";
    }*/


}
