package com.wkh.mystream.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a-1","b-2","c-3","d-4");
        //map:转换流中的数据类型

        //Function<String, Integer>:
        //      第一个类型：流中原本的数据类型
        //      第二个类型：要转换的类型
        //apply(String s) :
        //      s依次表示流中的每一个数据
        //返回值：表示转换之后的数据
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //split字符串的切割，返回一i个数组
                String[] arr = s.split("-");
                String str = arr[1];
                return Integer.parseInt(str);
            }
        }).forEach(s-> System.out.println(s));
        System.out.println("====================");


        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
