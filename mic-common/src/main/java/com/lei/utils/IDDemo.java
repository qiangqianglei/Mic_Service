package com.lei.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author ：leiqq
 * @date ：Created in 2020/12/25 11:27
 * @description：
 */
public class IDDemo {

    public static void main(String[] args) {

        //System.out.println(UUID.randomUUID().toString());
//        System.out.println("11111111111111111111111111111111111111111".length());
//
//        Long time = 2199023255551L;
//        Date date = new Date(time);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
//
//        System.out.println(2039 - 1970);

        Long workerId = 0L;
        Long datacenterId = 1L;
        Snowflake snowflake = IdUtil.getSnowflake(workerId, datacenterId);
        System.out.println(snowflake.nextId());

        System.out.println("1342358390034268160".length());
    }
}
