package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class TongJiManZuNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int max=0, sum=0;
        if (number1 > number2) {
            max = number1;
            number1 = number2;
            number2 = max;
        }
        for (int i = number1; i <= number2; i++) {
            if(i%3==0&&i%5==0) sum = sum + i;
        }
        System.out.println(number1+"到"+number2+"既可以被三整除的数又可以被五整除的数和为"+sum);
    }
}
