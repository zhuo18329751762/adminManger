package DouDiZhu3;


import java.util.*;


public class PokerGame {
    //准备牌
    //静态代码块
    //随着类的加载而加载,而且只执行一次

    //牌盒
    //♥3 ♣3
    static ArrayList<String> list=new ArrayList<>();
    //创建一个集合，指定牌的价值
    static HashMap<String,Integer> hm=new HashMap<>();
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
        list.add(" 小王");
        list.add(" 大王");
        //指定牌的价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",16);
        hm.put("大王",17);
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
        //排序
        order(lord);
        order(play1);
        order(play2);
        order(play3);
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
    public void order(ArrayList<String> list){
        //利用牌的价值进行排序
        Collections.sort(list, new Comparator<String>() {
            //Array.sort(插入排序+二分查找)
            @Override
            public int compare(String o1, String o2) {
                //负数：o1小 插入到前面
                //正数：o1大 插入到后面
                //0：o1与o2的数字一样，需要按照花色再次排序
                // 1 计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                // 2 计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i=value1-value2;
                //价值一样，比较花色，价值不一样，比较价值
                return i==0?color1.compareTo(color2):i;
            }
        });
    }
    public int getValue(String poker){
        //获取牌上的数字
        String num=poker.substring(1);
        //拿着数字到map集合中判断是否存在
        //存在，获取价值
        //不存在，类型转换
        if(hm.containsKey(num)){
            //存在，获取价值
            return hm.get(num);
        }else{
            //不存在,类型转换
            return Integer.parseInt(num);
        }
    }
}
