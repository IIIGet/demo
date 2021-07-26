package com.example.controller;

import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("done")
    public String insert(Integer userId,String username,Integer gId,String gName,float gPrice,Integer orderNum){
        orderService.insertOrder(userId,username,gId,gName,gPrice,orderNum);
        return "pay";
    }
}
