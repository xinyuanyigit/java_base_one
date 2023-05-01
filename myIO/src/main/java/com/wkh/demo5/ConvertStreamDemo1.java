package com.wkh.demo5;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码读取
       /* InputStreamReader isr = new InputStreamReader(new FileInputStream("myIO\\src\\main\\resources\\f.txt"),"GBK");
        int b;
        while ((b = isr.read())!=-1){
            System.out.print((char) b);
        }
        isr.close();*/


        FileReader fr = new FileReader("myIO\\src\\main\\resources\\f.txt", Charset.forName("GBK"));
        int b;
        while ((b = fr.read())!=-1){
            System.out.print((char) b);
        }
        fr.close();
    }
}
