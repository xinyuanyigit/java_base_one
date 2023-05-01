package com.wkh.demo6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test1Other {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIO\\src\\main\\resources\\c.txt"));
        ArrayList<Employ> list = (ArrayList<Employ>) ois.readObject();
        System.out.println(list);
        ois.close();
    }
}
