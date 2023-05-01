package com.wkh.demo1.myByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("myIO\\a.txt");
        //true:开启继续读入
        FileOutputStream ofs = new FileOutputStream(file, true);
        /*String str = "wkhwkhwkhwkhwkhwkhwkh";
        byte[] bytes = str.getBytes();
        ofs.write(bytes);

        //读入换行
        String hh = "\r\n";
        byte[] bytes2 = hh.getBytes();
        ofs.write(bytes2);

        String str2 = "qwer";
        byte[] bytes1 = str2.getBytes();
        ofs.write(bytes1);*/
        String str = "hello";
        byte[] bytes = str.getBytes();
        ofs.write(bytes);
        ofs.close();
    }
}
