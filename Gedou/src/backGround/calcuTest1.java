package backGround;

import cals.Calcu;
import menu.Calsmenu;

import java.util.Scanner;

public class calcuTest1 {
    public static void main(String[] args) {
        Calsmenu calsmenu=new Calsmenu();
        while(true) {
            Calsmenu.menuOne();
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            Calcu cal=new Calcu();
            System.out.println("请输入第一个数");
            cal.setNum1(sc.nextFloat());
            System.out.println("请输入第二个数");
            cal.setNum2(sc.nextFloat());
            switch (i) {
                case 1:
                    //加法
                    cal.add(cal.getNum1(), cal.getNum2());
                    break;
                case 2:
                    cal.jianFa(cal.getNum1(), cal.getNum2());
                    //减法
                    break;
                case 3:
                    cal.chenFa(cal.getNum1(), cal.getNum2());
                    //乘法
                    break;
                case 4:
                    cal.cuFa(cal.getNum1(), cal.getNum2());
                    //除法
                    break;
                case 5:
                    cal.ciFang(cal.getNum1(), cal.getNum2());
                    //次方
                    break;
                default:
                    System.out.println("没有该功能!!!");
                    break;
            }
        }
    }

}
