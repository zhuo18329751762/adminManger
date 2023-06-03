package Test;

import java.util.Random;

public class Test7_7 {
    /*
    编写一个程序，生成 0 和 9 之间的 100 个随机整数，然后显示每一个数出现
的次数
     */
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int j = r.nextInt(10);
            arr[j]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+": "+arr[i]);
        }
    }
}
