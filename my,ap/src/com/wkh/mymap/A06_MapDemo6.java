package com.wkh.mymap;

import java.util.*;
import java.util.function.BiConsumer;

public class A06_MapDemo6 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        List<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
//        System.out.println(list);
        HashMap<String,Integer> map = new HashMap<>();
        for (String name : list) {
            if (map.containsKey(name)){
                Integer count = map.get(name);
                count = count + 1;
                map.put(name,count);
            }else{
                map.put(name,1);
            }
        }
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"="+value);
            }
        });

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int max = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue()>max){
                max = entry.getValue();
            }
        }
        System.out.println("最大投票为："+max);

        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value == max){
                String key = entry.getKey();
                System.out.println("最大投票数对应的景点为："+key);
            }
        }
    }
}
