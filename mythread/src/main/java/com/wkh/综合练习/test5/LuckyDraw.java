package com.wkh.综合练习.test5;

import java.util.Collections;
import java.util.List;

public class LuckyDraw extends Thread{
    private List<Integer> list;

    public LuckyDraw() {
    }

    public LuckyDraw(String name, List<Integer> list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (LuckyDraw.class){
                if (list.size() == 0){
                    break;
                }else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    System.out.println(getName()+"又产生一个"+price+"元的大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
