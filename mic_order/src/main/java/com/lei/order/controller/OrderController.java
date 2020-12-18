package com.lei.order.controller;

import com.lei.order.entity.User;
import com.lei.order.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
// 开启配置文件动态刷新
@RefreshScope
public class OrderController {

    @Autowired
    private UserMapper userMapper;

    @Value("${vvip}")
    private String vvip;

    @GetMapping("/getOrder")
    public String getOrder() {
        return "恭喜["+ vvip +"]获得了订单....零食大礼包";
    }

    @GetMapping("/getUserList")
    public List<User> getUserList() {
       return userMapper.selectList(null);
    }
}
