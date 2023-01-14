package Test;

import java.util.Arrays;

public class NoDieRabbit {
    public static void main(String[] args) {
        //有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月又会每月生一对兔子，假如兔子都不死
        //问第十二个月的兔子对数为多少
        //一月 1
        //二月 1
        //三月 2
        //四月 3
        //五月 5
        //六月 8
//        int[] arr=new int[10];
//        arr[0]=1;
//        arr[1]=1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));
        //递归算法
        System.out.println(getSum(12));
    }
    public static int getSum(int month){
        if(month==1||month==2){
            return 1;
        }else{
            return getSum(month-1)+getSum(month-2);
        }

    }
}
