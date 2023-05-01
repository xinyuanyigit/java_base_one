package com.wkh.mystream.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd","eee","aaa","aaa");
        //distinct：元素去重,依赖hashcode和equals
        list.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("===============");

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"111","222","333","444","555");
        //concat：合并两个stream流
        Stream.concat(list.stream(),list1.stream())
                .distinct()
                .forEach(s-> System.out.println(s));
    }
}
