package com.wkh.mytreemap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeMap.put(4,"A");
        treeMap.put(2,"B");
        treeMap.put(5,"C");
        treeMap.put(1,"D");
        treeMap.put(3,"E");
        treeMap.put(6,"F");
        treeMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key+"="+value);
            }
        });

    }
}
