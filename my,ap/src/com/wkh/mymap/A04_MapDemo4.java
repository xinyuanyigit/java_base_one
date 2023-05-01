package com.wkh.mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        /*map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println(key+" = "+value);
            }
        });*/
        map.forEach((Integer key, String value) -> System.out.println(key+" = "+value));
    }
}
