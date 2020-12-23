package com.lei.transport.service;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author lei
 */
@Service
public class TransportService {


    public static void main(String[] args) {

        Set<Map<String, Object>> set = new HashSet<>();
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        map2.put("a", "1");
        map2.put("b", "2");
        map2.put("c", "3");

        set.add(map);
        set.add(map2);

        set.forEach(System.out::println);
    }
}
