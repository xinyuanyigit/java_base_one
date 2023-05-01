package com.wkh.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        List<String> boyList = new ArrayList<>();
        List<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"小王","小张","小李","小范","小冉","小蒋","小刘");
        Collections.addAll(girlList,"小杨","小妍","小风");
        Random r= new Random();
        int num = r.nextInt(list.size());
        if (list.get(num) == 1){
            int index = r.nextInt(boyList.size());
            System.out.println(list.get(num)+boyList.get(index));
        }else{
            int index = r.nextInt(girlList.size());
            System.out.println(list.get(num)+girlList.get(index));
        }
    }
}
