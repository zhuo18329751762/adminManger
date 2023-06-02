package leetCood100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo66 {
    /*
    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]+1<10){
                digits[i]=digits[i]+1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        //此时位数超过上限，需要重新创建数组
        int[] num=new int[digits.length+1];
        num[0]=1;
        for (int i = 1; i < num.length; i++) {
            num[i]=digits[i-1];
        }
        return num;
    }
}
