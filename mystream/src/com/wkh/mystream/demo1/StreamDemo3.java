package com.wkh.mystream.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        //filter
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三三","张四四","张五五","张六","eee");
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name-> System.out.println(name));
        System.out.println("====================");


        //limit:取前几个元素
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"aaa","bbb","ccc","ddd","eee","fff");
        list1.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("==================");
        //skip:跳过前面几个元素
        list1.stream().skip(3).forEach(s-> System.out.println(s));
        System.out.println("=====================");

        //取中间几个元素
        //方法一
        list1.stream().limit(3).skip(2).forEach(s-> System.out.println(s));
        //方法二
        list1.stream().skip(2).limit(1).forEach(s-> System.out.println(s));
    }
}
