package com.wkh.综合练习.test5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,200,50,300,250,100,150,400);
        LuckyDraw t1 = new LuckyDraw("窗口一",list);
        LuckyDraw t2 = new LuckyDraw("窗口二",list);
        t1.start();
        t2.start();
    }
}
