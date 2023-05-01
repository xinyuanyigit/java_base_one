package com.wkh.mymethod.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");
        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));*/
        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("===============");
        Integer[] array = list.stream().map(Integer::parseInt).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(array));
    }
}
