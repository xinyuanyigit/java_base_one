package com.wkh.mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test4 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        List<String> list3 = new ArrayList<>();
        list3.add("G");
        list3.add("H");
        list3.add("I");
        List<String> list4 = new ArrayList<>();
        list4.add("J");
        list4.add("K");
        list4.add("L");
        map.put("1",list1);
        map.put("2",list2);
        map.put("3",list3);
        map.put("4",list4);
        map.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String key, List<String> value) {
                System.out.println(key+" = "+value);
            }
        });
    }
}
