package com.wkh.mytreemap;

import com.sun.source.tree.Tree;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A03_TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (treeMap.containsKey(c)){
                Integer count = treeMap.get(c);
                count++;
                treeMap.put(c,count);
            }else{
                treeMap.put(c,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        treeMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}
