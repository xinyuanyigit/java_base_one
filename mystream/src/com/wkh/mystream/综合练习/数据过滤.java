package com.wkh.mystream.综合练习;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 数据过滤 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        Integer[] array = list.stream().filter(s -> s % 2 != 0).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(array));
    }
}
