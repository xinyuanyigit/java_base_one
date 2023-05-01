package com.wkh.mystream.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张小三","张某","小张");
        list.stream().filter(name -> name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name -> System.out.println(name));

    }
}
