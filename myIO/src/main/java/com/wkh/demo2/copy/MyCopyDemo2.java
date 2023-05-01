package com.wkh.demo2.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class MyCopyDemo2 {
    public static void main(String[] args) throws IOException {
        //把文件拷贝到当前模块下
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\flieTest\\b.txt");
        FileOutputStream fos = new FileOutputStream("myIO\\b.txt");
        //拷贝
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[3];

        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //释放资源
        fos.close();
        fis.close();

    }
}
