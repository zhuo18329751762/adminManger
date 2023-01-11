package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyInput {
    public static void main(String[] args) {
        //键盘录入一些1~100的整数，并添加到集合中
        //直到集合中的所有数据和超过200为止
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if(num<1||num>100){
                System.out.println("输入的数字不在1~100的范围，请重新输入");
                continue;
            }
            //num是基本数据类型，集合数据类型是Integer
            //在add时触发了自动装箱
            list.add(num);
            //统计集合中数据和
            int sum=getSum(list);
            if(sum>200){
                System.out.println("集合数据之和已经超过200");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            int num=list.get(i);
            sum+=num;
        }
        return sum;
    }
}
