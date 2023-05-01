package com.wkh.mytest;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"小王","小张","小李","小范","小冉","小蒋","小刘","小杨","小妍","小风");
        int n =10;
        while (n-->0){
            Collections.shuffle(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
