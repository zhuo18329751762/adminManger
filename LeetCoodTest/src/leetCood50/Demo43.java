package leetCood50;

import java.math.BigInteger;
import java.util.Arrays;

public class Demo43 {
    /*
    给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
     */
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "123";
        String multiply = multiply(num1, num2);
        System.out.println(multiply);
    }

    public static String multiply(String num1, String num2) {
        //如果这两个字符串任意一个为"0"时，直接返回"0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length(), n = num2.length();
        //两个整数相乘，积的位数不会超过这两个数的位数和
        //例如:99+99=198不会超过4位数
        //所以我们定义一个长度为m+n的数组
        int[] ansArr = new int[m + n];
        //根据乘法的规律，给数组赋值
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                //i+j+1即代表这个乘积所在的位置
                ansArr[i + j + 1] += x * y;
            }
        }
        //准备一个StringBuilder字符串来存储结果
        StringBuilder sb=new StringBuilder();
        int val=0;
        int num=0;
        for (int i = ansArr.length-1; i >=0; i--) {
            //num是这一位的值
            num=(ansArr[i]+val)%10;
            //val是向前一位进的值
            val=(ansArr[i]+val)/10;

            //当i=0时，不用拼接
            if(!(i==0&&num==0)) {
                sb.append(num);
            }
        }
        //因为字符串的拼接是从后往前，所以结果应当是对sb反转
        return sb.reverse().toString();
    }
}
