package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test7_27 {
    /*
    如果两个数组 listl和 list2 的内容相同，那么就说它们是相同的。使用下面的

方法头编写一个方法，如果 listl和 list〗是相同的，该方法就返回 true:

public static boolean equals(int[] listl, int[] list2)

编写一个测试程序，提示用户输人两个整数列表，然后显示它们两个是否相同。下面是运

行示例。注意，输入的第一个数字表示列表中元素的个数。该数字不是列表的一部分。
     */
    public static boolean equals(int[] list1,int[] list2){
        if(list1.length!= list2.length){
            return false;
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数组的长度");
        int len1 = sc.nextInt();
        System.out.println("请输入第一个数组的内容");
        int[] list1=new int[len1];
        for (int i = 0; i < len1; i++) {
            list1[i]=sc.nextInt();
        }
        System.out.println("输入第二个数组的长度");
        int len2 = sc.nextInt();
        System.out.println("请输入第二个数组的内容");
        int[] list2=new int[len2];
        for (int i = 0; i < len2; i++) {
            list2[i]=sc.nextInt();
        }
        boolean equals = equals(list1, list2);
        System.out.println(equals);
    }
}
