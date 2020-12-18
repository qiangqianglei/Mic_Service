package com.lei.transport.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans")
public class TransportController {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/getOrder")
    //@SentinelResource(value = "getOrder")
    public String getOrder() {
        return orderFeign.getOrder();
    }

    @GetMapping("/getTrans")
    public String getTrans() {
        return "执行了mic-transport服务的getTrans方法啦!";
    }
}
