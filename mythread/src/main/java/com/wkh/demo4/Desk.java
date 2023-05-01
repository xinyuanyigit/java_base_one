package com.wkh.demo4;

public class Desk {
    //定义锁对象
    static Object lock = new Object();
    //是否有面条
    static int foodFlag = 0;
    //吃的总个数
    static int count = 10;
}
