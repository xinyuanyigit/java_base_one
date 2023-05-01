package com.wkh.demo5;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码写出
       /* OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIO\\src\\main\\resources\\a.txt"),"GBK");
        osw.write("你好，世界");
        osw.close();*/

        FileWriter fw = new FileWriter("myIO\\src\\main\\resources\\b.txt", Charset.forName("GBK"));
        fw.write("你好，世界");
        fw.close();
    }
}
