package com.wkh.demo5;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(1);
        Cook c = new Cook((ArrayBlockingQueue<String>) queue);
        Foodie f = new Foodie((ArrayBlockingQueue<String>) queue);
        c.start();
        f.start();
    }

}
