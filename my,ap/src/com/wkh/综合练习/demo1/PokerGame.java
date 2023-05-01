package com.wkh.综合练习.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    //准备一个牌盒
    static private ArrayList<String> list = new ArrayList<>();
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
        for (int i = 0; i < color.length; i++) {
            for (int j = 0;j<number.length;j++){
                list.add(color[i]+number[j]);
            }
        }
        list.add("大王");
        list.add("小王");

    }

    //洗牌

    public PokerGame() {
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
        
        //取牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i<=2){
                lord.add(poker);
            }else if (i%3 == 0){
                player1.add(poker);
            }else if (i%3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }
        //看牌
       lookPoker("底牌",lord);
       lookPoker("玩家一",player1);
       lookPoker("玩家二",player2);
       lookPoker("玩家三",player3);
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
