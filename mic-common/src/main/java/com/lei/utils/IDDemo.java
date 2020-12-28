package com.lei.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.*;

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
//
//        Long workerId = 0L;
//        Long datacenterId = 1L;
//        Snowflake snowflake = IdUtil.getSnowflake(workerId, datacenterId);
//        long nextId = snowflake.nextId();
//        System.out.println(nextId);
//
//        System.out.println(Long.toString(nextId).length());
        getIDBySnowFlake();
    }

    public static void getIDBySnowFlake() {

        ExecutorService threadPool=new ThreadPoolExecutor(2,5,
                1L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 1; i <= 20; i++) {
            threadPool.submit(() -> {
                Long workerId = 0L;
                Long datacenterId = 1L;
                Snowflake snowflake = IdUtil.getSnowflake(workerId, datacenterId);
                long nextId = snowflake.nextId();
                System.out.println(nextId);
            });
        }
    }
}
