package com.lei.gateway.controller;

import com.lei.gateway.entity.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallbackA")
    public ResultVO fallbackA() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode("100");
        resultVO.setMessage("服务暂时不可用");
        return resultVO;
    }
}
