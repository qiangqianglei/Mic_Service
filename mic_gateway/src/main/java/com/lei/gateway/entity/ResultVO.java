package com.lei.gateway.entity;

import lombok.Data;

@Data
public class ResultVO {

    private String code;
    private String message;

    public ResultVO() {

    }

    public ResultVO(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
