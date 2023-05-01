package com.wkh.demo2.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class MyCopyDemo1 {
    public static void main(String[] args) throws IOException {
        //把文件拷贝到当前模块下
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\flieTest\\b.txt");
        FileOutputStream fos = new FileOutputStream("myIO\\b.txt");
        //拷贝
        //读一个写一个
        long start = System.currentTimeMillis();
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        //释放资源
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
