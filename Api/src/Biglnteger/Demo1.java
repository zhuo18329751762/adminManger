package Biglnteger;

import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {
        // 1 创建两个BigInteger对象
        BigInteger bd1= BigInteger.valueOf(10);
        BigInteger bd2= BigInteger.valueOf(5);
        // 2 加法
        BigInteger bd3=bd1.add(bd2);//15
        System.out.println(bd3);
        // 3 除法 获取商和余数
        BigInteger[] arr=bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);//2
        System.out.println(arr[1]);//0
        // 4 比较是否相同
        boolean equal=bd1.equals(bd2);
        System.out.println(equal);//false
        // 5 次幂
        BigInteger bd4 = bd1.pow(2);//10的平方100
        System.out.println(bd4);
        // 6 max
        BigInteger bd5=bd1.max(bd2);//没有创建新的对象 因为数值没有发生改变
        System.out.println(bd5);

        // 7 转为int类型整数 超出范围数据有误
        BigInteger bd6=BigInteger.valueOf(2147483647L);
        int i=bd6.intValue();
        System.out.println(i);

    }
}
