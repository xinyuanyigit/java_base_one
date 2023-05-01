package com.wkh.综合练习;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) throws IOException {
        //把文件中的所有数据读到内存
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\main\\resources\\name.txt"));
        String line;
        while ((line = br.readLine())!=null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();


        double arr[] = new double[list.size()];
        //总权重
        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }
        //计算每个的权重
        int i = 0;
        for (Student stu : list) {
            arr[i] = stu.getWeight()/weight;
            i++;
        }
        //计算权重占比
        for (int index = 1; index < arr.length; index++) {
            arr[index] = arr[index]+arr[index-1];
        }

        //随机抽取
        double num = Math.random();
        //判断num在数组中的位置
        //二分查找
            //结果 = -插入点-1
        //要找到插入点：
            //插入点 = -结果-1
        int index = Arrays.binarySearch(arr, num);
        int result = -index-1;
//        System.out.println(list.get(result));
        //更改权重
        Student student = list.get(result);
        student.setWeight(student.getWeight()/2);
//        System.out.println(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\main\\resources\\name.txt"));
        for (Student stu : list) {
            bw.write(stu.getName()+"-"+stu.getSex()+"-"+stu.getAge()+"-"+stu.getWeight());
            bw.newLine();
        }
        bw.close();
    }
}
