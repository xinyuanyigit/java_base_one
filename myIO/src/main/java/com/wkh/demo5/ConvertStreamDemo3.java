package com.wkh.demo5;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //将本地文件中的gbk文件，转成utf-8
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("myIO\\src\\main\\resources\\a.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIO\\src\\main\\resources\\c.txt"),"UTF-8");
        int b;
        while ((b = isr.read())!=-1){
            osw.write(b);
        }
        osw.close();
        isr.close();*/

        FileReader fr = new FileReader("myIO\\src\\main\\resources\\a.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("myIO\\src\\main\\resources\\d.txt",Charset.forName("UTF-8"));
        int b ;
        while ((b = fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
