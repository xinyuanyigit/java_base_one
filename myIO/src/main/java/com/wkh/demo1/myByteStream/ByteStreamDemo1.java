package com.wkh.demo1.myByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输出流FileOutputStream
         */
        //0.创建一个文件
        File file = new File("myIO\\a.txt");
        file.createNewFile();
        //1.创建对象,并指定路径
//        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        //写出数据
        fos.write(97);
        fos.write(98);
        fos.write(114514);
        //释放资源
        fos.close();
    }
}
