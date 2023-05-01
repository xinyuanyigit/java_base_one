package com.wkh.综合练习.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LuckyDraw extends Thread{
    private List<Integer> list;

    //加一个容器
    private ArrayList<Integer> container = new ArrayList<>();
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
                    Collections.sort(container, new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o2-o1;
                        }
                    });
                    System.out.println(getName()+container);
                    System.out.println("最大值为："+container.get(0));
                    break;
                }else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
//                    System.out.println(getName()+"又产生一个"+price+"元的大奖");
                    container.add(price);
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
