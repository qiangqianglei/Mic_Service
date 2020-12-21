package com.lei.transport.controller;

import feign.OrderFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans")
@Api(tags = "transport初始测试相关接口")
public class TransportController {

    @Autowired
    private OrderFeign orderFeign;

    @ApiOperation("获取订单接口")
    @GetMapping("/getOrder")
    public String getOrder() {
        return orderFeign.getOrder();
    }

    @ApiOperation("获取trans接口")
    @GetMapping("/getTrans")
    public String getTrans() {
        return "执行了mic-transport服务的getTrans方法啦!";
    }
}
