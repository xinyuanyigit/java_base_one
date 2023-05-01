package com.wkh.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        /*for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }*/
        /*Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }*/
        entries.forEach(new Consumer<Map.Entry<Integer, String>>() {
            @Override
            public void accept(Map.Entry<Integer, String> entry) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+" = "+value);
            }
        });
    }
}
