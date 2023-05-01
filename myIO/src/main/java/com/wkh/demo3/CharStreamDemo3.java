package com.wkh.demo3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.WeekFields;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字符输出流
        //如果文件不存在，则自动创建一个，但要求父路径一定要正确
        FileWriter fw = new FileWriter("myIO\\c.txt");
//        FileWriter fw = new FileWriter("myIO\\c.txt",true);
//        fw.write(97);
        /*fw.write("你好，世界");
        fw.write("\r\n");
        fw.write("hello,world");*/
        char[] ch = {'h','e','l','l','o',' ','w','o','r','l','d'};
        fw.write(ch);
        fw.close();
    }
}
