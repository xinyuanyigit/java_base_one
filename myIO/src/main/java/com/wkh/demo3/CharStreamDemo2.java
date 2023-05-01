package com.wkh.demo3;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符输入流
        FileReader fr = new FileReader("myIO\\a.txt");
        char[] ch = new char[2];
        int len;
        while ((len = fr.read(ch))!=-1){
            System.out.print(new String(ch,0,len));
        }
        fr.close();
    }
}
