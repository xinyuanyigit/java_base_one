package com.wkh.demo4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyTest1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件夹
        //1.创建对象表示数据源
        File src = new File("D:\\flieTest\\a");
        //2.创建对象表示目的地
        File dest = new File("D:\\flieTest\\dest");
        //3.调用方法开始拷贝
        copydir(src,dest);

    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //3.判断是否是文件，是文件拷贝
                FileInputStream inputStream = new FileInputStream(file);
                FileOutputStream OutputStream = new FileOutputStream(new File(dest,file.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = inputStream.read(bytes))!=-1){
                    OutputStream.write(bytes,0,len);
                }
                OutputStream.close();
                inputStream.close();
            }
            //4.判断是否是文件夹，进行递归
            if (file.isDirectory()){
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
