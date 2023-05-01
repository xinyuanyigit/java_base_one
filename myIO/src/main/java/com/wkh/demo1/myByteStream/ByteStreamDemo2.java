package com.wkh.demo1.myByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输出流FileOutputStream
         */

        //1.创建对象,并指定路径
        FileOutputStream fos = new FileOutputStream("myIO\\a.txt");
        //写出数据
        /*fos.write(97);
        fos.write(98);
        fos.write(114514);*/
        byte[] b = {97,98,99,100,101};
//        fos.write(b);
        fos.write(b,2,3);
        fos.write(103);
        //释放资源
        fos.close();
    }
}
