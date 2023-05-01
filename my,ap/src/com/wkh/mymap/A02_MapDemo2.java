package com.wkh.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        /*Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key+" = "+map.get(key));
        }*/
        /*System.out.println("===============");
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }*/
        /*System.out.println("=================");
        Set<Integer> keySet = map.keySet();
        keySet.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer key) {
                String value = map.get(key);
                System.out.println(key+" = "+value);
            }
        });*/

        System.out.println("=================");
        Set<Integer> keySet = map.keySet();
        keySet.forEach( key -> {
                String value = map.get(key);
                System.out.println(key+" = "+value);
            });
    }
}
