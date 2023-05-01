package com.wkh.综合练习.test3;

public class Print extends Thread{
    public Print() {
    }

    public Print(String name) {
        super(name);
    }
    private int n = 1;
    static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (n>100){
                    break;
                }else{
                    if (n%2 != 0){
                        System.out.println(getName()+"-"+n);
                    }
                    n++;
                }

            }
        }
    }
}
