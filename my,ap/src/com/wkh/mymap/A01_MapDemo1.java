package com.wkh.mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zhangsan","1");
        map.put("lisi","2");
        map.put("wangwu","3");
        map.put("zhaoliu","4");
        map.put("tianqi","5");
        //put：返回被覆盖的值
        String zhangsan = map.put("zhangsan", "22");
        System.out.println(zhangsan);
        String lisi = map.get("lisi");
        System.out.println(lisi);
        String zhangsan1 = map.remove("zhangsan");
        System.out.println(zhangsan1);
        boolean flag = map.containsValue("2");
        System.out.println(flag);
        boolean tianqi = map.containsKey("tianqi");
        System.out.println(tianqi);
//        map.clear();
        System.out.println(map);
    }
}
