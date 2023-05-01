package com.wkh.demo3;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象并关联本地文件
        FileReader fr = new FileReader("myIO\\a.txt");
        //读取数据
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.print((char) ch);
        }
        //释放资源
        fr.close();

    }
}
