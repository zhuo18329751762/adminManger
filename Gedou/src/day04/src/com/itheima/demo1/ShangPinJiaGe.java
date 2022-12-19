package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class ShangPinJiaGe {
    public static void main(String[] args) {
        //键盘录入顾客会员等级，此时商品价格为1000
        int price=1000;
        System.out.println("请输入您的会员等级:");
        Scanner sc=new Scanner(System.in);
        int garde=sc.nextInt();
        if(garde>=0&&garde<=3){
            if (garde==1) {
                System.out.println("商品价格为:"+(price*0.9));
            }else if(garde==2){
                System.out.println("商品价格为:"+(price*0.8));
            }else if(garde==3) {
                System.out.println("商品价格为:"+(price*0.7));
            }else{
                System.out.println("不打折，商品价格为"+1000);
            }
        }else{
            System.out.println("您的输入不合法,请重新输入！");
        }
    }
}
