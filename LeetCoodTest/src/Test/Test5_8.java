package Test;

import java.util.Random;
import java.util.Scanner;

public class Test5_8 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的个数");
        num=sc.nextInt();
        String[] names=new String[num];
        double[] scores=new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            names[i]=sc.next();
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            scores[i]=sc.nextDouble();
        }
        int max=0;
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>scores[max]){
                max=i;
            }
        }
        System.out.println("得分最高的学生是"+names[max]);
    }
}