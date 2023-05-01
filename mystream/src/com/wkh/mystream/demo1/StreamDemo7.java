package com.wkh.mystream.demo1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-22","李四-男-23","王五-男-24","小赵-女-25","小夏-女-26");
        list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
        System.out.println("================");
        //collect：把收集到的数据变为集合
        //      toList:转换成list集合，允许重复元素
        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList);
        System.out.println("====================");
        //       toSet:转换成list集合，不允许重复元素
        Set<String> set = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("=====================");

        /**
         *toMap:参数一表示键的生成规则
         *      参数二表示值的生成规则
         *参数一：
         *      Function泛型一：表示流中每一个数据的类型
         *              泛型二：表示map集合中键的数据类型
         *      方法apply的形参：依次表示流里的每一个数据
         *              方法体：生成键的代码
         *              返回值：已经生成的键
         *参数二：
         *       Function泛型一：表示流中每一个数据的类型
         *          *              泛型二：表示map集合中值的数据类型
         *          *      方法apply的形参：依次表示流里的每一个数据
         *          *              方法体：生成值的代码
         *          *              返回值：已经生成的值
         */
        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        //设置键的规则
                        new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                },
                        //设置值的规则
                        new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);
        System.out.println("==============");
        //lambda表达式
        Map<String, Integer> map1 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map1);
    }
}
