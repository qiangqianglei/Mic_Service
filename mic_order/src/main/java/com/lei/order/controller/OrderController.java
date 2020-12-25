package com.lei.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lei.order.entity.User;
import com.lei.order.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/timeout")
    public String timeout() throws InterruptedException {
        Thread thread = new Thread();
        thread.sleep(3 * 1000);
        return "order服务timeout方法执行..";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "testHotKeyHandler")
    public String testHotKey(@RequestParam (name = "p1", required = false) String p1,
                             @RequestParam (name = "p2", required = false) String p2) {
        return "===========================testHotKey";
    }

    public String testHotKeyHandler(String p1, String p2, BlockException exception) {
        return "===========================testHotKeyHandler 0~0";
    }
}
