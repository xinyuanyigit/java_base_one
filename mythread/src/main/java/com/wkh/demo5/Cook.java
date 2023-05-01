package com.wkh.demo5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    //创建阻塞队列的变量
    private ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    public Cook(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            //不断的把面条加到队列中
            try {
                queue.put("面条");
                System.out.println("厨师做了一碗面");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
