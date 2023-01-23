package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //被点到的学生不会再被点到，但是如果班级中的学生都点完了，需要重新开启第二轮点名
        //定义集合
        ArrayList<String> list=new ArrayList<>();
        //添加元素
        Collections.addAll(list,"张三","李四","王五","赵六","刘七","小丽","小花","小倩");
        //随机点名
        boolean flag=true;
        while (flag) {
            System.out.println("是否开始新一轮点名?");
            System.out.println("1:开始");
            System.out.println("2:结束");
            Scanner sc=new Scanner(System.in);
            String num=sc.nextLine();
            if(num.equals("1")){
                Collections.shuffle(list);
                printf(list);
                flag=true;
            }else if(num.equals("2")){
                flag=false;
                System.out.println("您已退出点名");
            }else {
                System.out.println("您的输入有误,请重新输入");
                continue;
            }
        }
    }
    public static void printf(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
