package Test;

public class Monkey {
    public static void main(String[] args) {
        //有一堆桃子，猴子第一天吃了其中一半，并多吃了一个！以后猴子每天都吃当前剩下的一半，然后
        //再多吃一个，第十天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共有多少个桃子
        //day10 1
        //day9 (day10+1)*2 4
        //day8 (day9+1)*2 10
        //反向递归
        System.out.println(getCount(1));//1534
    }
    public static int getCount(int day){
        if(day<=0||day>=11){
            System.out.println("当前时间错误");
            return -1;
        }
        //递归的出口
        if(day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;
    }
}
