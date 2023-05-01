package com.wkh.demo4;

import java.io.*;

public class MyTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("myIO\\2.jpg");
        FileOutputStream dest = new FileOutputStream("myIO\\3.jpg");
        int b;
        while ((b = src.read())!=-1){
            dest.write(b ^ 2);
        }
        dest.close();
        src.close();
        /*decryption(src,dest);*/
    }

    /*private static void decryption(FileInputStream src, FileOutputStream dest) throws IOException {
        int len;

        while ((len = src.read())!=-1);{
            dest.write(len ^ 2);
        }
        dest.close();
        src.close();
    }*/

    /*private static void encryption(FileInputStream src, FileOutputStream dest) throws IOException {
        int len;

        while ((len = src.read())!=-1);{
            dest.write(len^10);
        }
        dest.close();
        src.close();
    }*/
}
