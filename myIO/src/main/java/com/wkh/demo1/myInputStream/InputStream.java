package com.wkh.demo1.myInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("myIO\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        /*int b1 = fis.read();
        int b2 = fis.read();
        int b3 = fis.read();
        int b4 = fis.read();
        int b5 = fis.read();
        int b6 = fis.read();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);*/
        int b;
        while ((b = fis.read())!=-1){
            System.out.println((char) b);
        }

        //读完了，返回-1
        /*int read = fis.read();
        System.out.println(read);//-1*/
        fis.close();
    }
}
