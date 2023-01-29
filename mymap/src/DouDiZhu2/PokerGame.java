package DouDiZhu2;


import java.util.*;


public class PokerGame {
    //使用HashMap集合来确定牌与序号的关系，不用排序所以使用HashMap
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    //准备牌
    //静态代码块
    //随着类的加载而加载,而且只执行一次

    //牌盒
    //♥3 ♣3
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;
        for (String n : number) {
            //n表示数字
            for (String c : color) {
                //c表示花色
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            //i表示每一张牌的索引
            Integer serialNumber = list.get(i);
            if(i<=2){
                lord.add(serialNumber);
                continue;
            }
            if(i%3==0){
                player1.add(serialNumber);
            }else if(i%3==1){
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);

    }
    public void lookPoker(String name, TreeSet<Integer> player){
        System.out.println(name+": ");
        for (Integer serialNumber : player) {
            String poker = hm.get(serialNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
