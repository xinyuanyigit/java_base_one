package com.wkh.综合练习.demo3;

import java.util.*;

public class PokerGame3 {
    //买牌
    //牌盒
    //存牌对应的序号
    private static List<String> list = new ArrayList<>();
    private static Map<String,Integer> map = new HashMap<>();
    static {
        //花色
        String[] color = {"♥", "♠", "♦", "♣"};
        //牌数
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
                for (String n : number) {
                list.add(c+n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",14);
        map.put("2",15);
        map.put("小王",50);
        map.put("大王",100);
    }
    public PokerGame3() {
        //洗牌
        //打乱牌的序号
        Collections.shuffle(list);
        //发牌
        //拿出底牌
        List<String> lord = new ArrayList<>();
        //第一位牌手
        List<String> player1 = new ArrayList<>();
        //第二位牌手
        List<String> player2 = new ArrayList<>();
        //第三位牌手
        List<String> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i<=2){
                lord.add(list.get(i));
            }else if (i%3 == 1){
                player1.add(list.get(i));
            }else if (i%3 == 2){
                player2.add(list.get(i));
            }else {
                player3.add(list.get(i));
            }
        }

        order(lord);
        order(player1);
        order(player2);
        order(player3);

        lookPoker("底牌",lord);
        lookPoker("玩家一",player1);
        lookPoker("玩家二",player2);
        lookPoker("玩家三",player3);
    }
    public void order(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                //计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                //比较o1和o2的价值
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;

            }
        });
    }
    public int getValue(String poker){
        //获取牌上的数字
        String number = poker.substring(1);
        //拿着数字到map集合中判断是否存在
        if (map.containsKey(number)){
            //存在
            return map.get(number);
        }else {
            //不存在
            return Integer.parseInt(number);
        }
    }
    //看牌
    public void lookPoker(String name,List<String> list){
        System.out.print(name+": ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
