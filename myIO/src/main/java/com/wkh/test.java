package com.wkh;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "abc你好";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));
        //解码
        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(bytes,"gbk");
        System.out.println(str3);
    }
}
