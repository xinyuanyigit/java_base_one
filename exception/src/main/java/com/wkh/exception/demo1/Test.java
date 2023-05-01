package com.wkh.exception.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Friend f1 = new Friend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入朋友的姓名");
                String name = sc.nextLine();
                f1.setName(name);
                System.out.println("请输入朋友的年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                f1.setAge(age);
                break;
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                continue;
            }catch (NameFormatException e) {
                e.printStackTrace();
                continue;
            }catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
        }
        System.out.println(f1);
    }
}
