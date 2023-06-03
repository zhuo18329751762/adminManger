package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test7_19 {
    /*
编写一个测试程序，提示用户输人一个列表，显示该列表是否已经排好序。下面是一个运

行示例。注意，输人中的第一个数表示列表中的元素个数。该数不是列表的一部分。
     */
    public static boolean isSorted(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            if(list[i+1]<list[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("请输入列表的长度");
        Scanner sc=new Scanner(System.in);
        int len = sc.nextInt();
        int[] list=new int[len];
        System.out.println("请输入列表中的内容");
        for (int i = 0; i < len; i++) {
            list[i]=sc.nextInt();
        }
        boolean sorted = isSorted(list);
        System.out.println(sorted);
    }
}
