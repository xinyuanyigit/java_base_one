package com.wkh.mystream.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        //count:统计流中的数据
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("================");

        //toArray:转换成数组
        //IntFunction方法的泛型:具体类型的数组
        //apply的形参:流中数据的个数，要跟数组的长度一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        System.out.println("===============");

        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
