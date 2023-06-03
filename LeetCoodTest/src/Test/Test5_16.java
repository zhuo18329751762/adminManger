package Test;

import java.util.Scanner;

public class Test5_16 {
    /*
    编写程序，读入一个整数，然后以升序显示它的所有最小因子。例如,
若输人的整数是 120, 那么输出就应该是：2,2, 2, 3, 5。
     */
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println(1);
            return;
        }
        while (num!=1){
            for (int i = 2; i <= num; i++) {
                if(num%i==0){
                    num=num/i;
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
