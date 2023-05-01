package com.wkh.mystream.demo1;

import java.awt.event.KeyListener;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        /**
         * 单列集合stream流
         */
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("===================");
        /**
         * 双列集合stream流
         */
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.keySet().stream().forEach(s -> System.out.println(map.get(s)));
        System.out.println("===================");
        /**
         * 数组stream流
         */
        int[] arr= {1,2,3,4,5};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("===================");
        /**
         * 一堆零散数据
         */
        Stream.of("A","B","C",1,2,3,4).forEach(serializable -> System.out.println(serializable));
    }
}
