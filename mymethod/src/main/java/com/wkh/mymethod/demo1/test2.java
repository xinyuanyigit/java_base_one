package com.wkh.mymethod.demo1;

import java.util.ArrayList;
import java.util.Collections;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三三","张四四","张五五","张六","eee");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("===============");
        //方法引用
        StringOperation stringOperation = new StringOperation();
        list.stream().filter(stringOperation::checkString).forEach(s -> System.out.println(s));
    }
}
