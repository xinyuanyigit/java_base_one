package com.wkh.demo1.myInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myIO\\a.txt");
        byte[] bytes = new byte[2];
        int len1 = fis.read(bytes);
        String str1 = new String(bytes,0,len1);
        System.out.println(len1+":"+str1);

        int len2 = fis.read(bytes);
        String str2 = new String(bytes,0,len2);
        System.out.println(len2+":"+str2);

        int len3 = fis.read(bytes);
        String str3 = new String(bytes,0,len3);
        System.out.println(len3+":"+str3);

        fis.close();
    }
}
