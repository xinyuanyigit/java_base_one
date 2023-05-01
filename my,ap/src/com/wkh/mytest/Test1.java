package com.wkh.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"小王","小张","小李","小范","小冉","小杨","小妍","小风");
       /* Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(list.size());
            System.out.println(list.get(index));
        }*/

        for (int i = 0; i < 5; i++) {
            /**
             * 打乱集合
             */
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }
    }
}
