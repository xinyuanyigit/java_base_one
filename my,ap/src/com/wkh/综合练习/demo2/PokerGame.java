package com.wkh.综合练习.demo2;

import org.w3c.dom.ls.LSInput;

import java.util.*;

public class PokerGame {
    //存牌对应的序号
    static private HashMap<Integer,String> hp = new HashMap<>();
    //准备一个牌盒
    static private ArrayList<Integer> list = new ArrayList<>();
    /**
     * 买牌
     * 准备一副牌
     */
    static {
        //花色
        String[] color = {"♥", "♠", "♦", "♣"};
        //牌数
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //组成一副牌
        /**
         * 数字放在前面循环，以便后面更好排序
         */
        //序号
        int serialNumber = 1;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0;j<color.length;j++){
                hp.put(serialNumber,number[i]+color[j]);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hp.put(serialNumber,"大王");
        list.add(serialNumber);
        serialNumber++;
        hp.put(serialNumber,"小王");
        list.add(serialNumber);

    }



    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        //排序
        //拿出底牌
        TreeSet<Integer> lord = new TreeSet<>();
        //第一位牌手
        TreeSet<Integer> player1 = new TreeSet<>();
        //第二位牌手
        TreeSet<Integer> player2 = new TreeSet<>();
        //第三位牌手
        TreeSet<Integer> player3 = new TreeSet<>();
        
        //取牌
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);

            if (i<=2){
                lord.add(num);
            }else if (i%3 == 0){
                player1.add(num);
            }else if (i%3 == 1){
                player2.add(num);
            }else{
                player3.add(num);
            }
        }

        //看牌
       lookPoker("底牌",lord);
       lookPoker("玩家一",player1);
       lookPoker("玩家二",player2);
       lookPoker("玩家三",player3);
    }
    //看牌
    public void lookPoker(String name,TreeSet<Integer> set){
        System.out.print(name+": ");
        for (Integer key : set) {
            String poker = hp.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
