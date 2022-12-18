package ZiFuChuan;

import java.util.Scanner;

public class JinEZhuanHuan {
    public static void main(String[] args) {
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("该金额无效!!!");
            }
        }
        //得到money中的每一位数字
        String moneyStr = "";
        while (money > 0) {
            int ge = money % 10;
            moneyStr = JinEZhuanHuan(ge) + moneyStr;
            money = money / 10;
        }
        //在前面补0，补齐七位
        int cout = 7 - moneyStr.length();
        for (int i = 0; i < cout; i++) {
            moneyStr = "零" + moneyStr;
        }
        String[] arr2 = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String mon="";
        for (int i = 0; i < moneyStr.length(); i++) {
            mon=mon+moneyStr.charAt(i)+arr2[i];
        }
        System.out.println(mon);
    }





    //数字对应转化为汉字
    public static String JinEZhuanHuan(int num){
        //定义数组
        String[] arr={"零","壹","贰","叄","肆","伍","陆","柒","捌","玖"};
        //返回结果
        return arr[num];
    }

}
