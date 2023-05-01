package com.wkh.mystream.综合练习;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,22","李四,23","王五,24","赵六,25","七七,26");
        Map<String, Integer> map = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).collect(Collectors.toMap(
                s -> s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])
        ));
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
