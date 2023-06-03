package Test;

import java.util.Scanner;

public class Test6_5 {
    /*
    (对三个數排序）使用下面的方法头编写方法，按升序显示三个数：
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("请输入第一个数");
        num1=sc.nextDouble();
        System.out.println("请输入第二个数");
        num2=sc.nextDouble();
        System.out.println("请输入第三个数");
        num3=sc.nextDouble();
        displaySortedNumber(num1,num2,num3);
    }
    public static void displaySortedNumber(double num1,double num2,double num3){
        double[] nums={num1,num2,num3};
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    double temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
