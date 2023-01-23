package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    //静态代码块
    //随着类的加载而加载,而且只执行一次

    //牌盒
    //♥3 ♣3
    static ArrayList<String> list=new ArrayList<>();
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            //c表示花色
            for (String n : number) {
                //n表示数字
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord=new ArrayList<>();
        ArrayList<String> play1=new ArrayList<>();
        ArrayList<String> play2=new ArrayList<>();
        ArrayList<String> play3=new ArrayList<>();
        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i：牌的序号
            String poker=list.get(i);
            if(i<=2){
                lord.add(poker);
                continue;
            }
            //给玩家发牌
            if(i%3==0){
                play1.add(poker);
            }else if(i%3==1){
                play2.add(poker);
            }else{
                play3.add(poker);
            }
        }
        //看牌
        lookPoker("张三",play1);
        lookPoker("李四",play2);
        lookPoker("王五",play3);
        lookPoker("底牌",lord);
    }
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+" ");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
