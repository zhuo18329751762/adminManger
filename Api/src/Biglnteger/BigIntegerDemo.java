package Biglnteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // 1 获取一个随机的大整数
        BigInteger bd1=new BigInteger(4,new Random());
        System.out.println(bd1);//[0,15]

        // 2 获取一个指定的大整数
        BigInteger bd2=new BigInteger("99999");//只能是整数
        System.out.println(bd2);

        // 3 获取指定进制的大整数
        //字符串中的数字必须是整数
        //进制必须保持一致
        BigInteger bd3=new BigInteger("100",2);//4
        System.out.println(bd3);

//        // 4 静态方法获取BigInteger的对象 内存有优化
//        // 1 :能表示的范围很小 在long的取值范围内 如果超出long的范围就不行了
//        // 2 :在内部对常用的数字：-16~16进行了优化
//        // 提前把-16~16先创建好BigInteger对象 如果多次获取不会创建新的
//        BigInteger bd4=BigInteger.valueOf(9223372036854775807L);
//        System.out.println(bd4);
//        System.out.println(Long.MAX_VALUE);//long的最大值
//        BigInteger bd5=BigInteger.valueOf(17);
//        BigInteger bd6=BigInteger.valueOf(17);
//        BigInteger bd7=BigInteger.valueOf(16);
//        BigInteger bd8=BigInteger.valueOf(16);
//        System.out.println(bd5==bd6);//false
//        System.out.println(bd7==bd8);//true

        // 5 对象一旦创建 内部的数据就不能发生改变
        BigInteger bd9=BigInteger.valueOf(1);
        BigInteger bd10=BigInteger.valueOf(2);
        BigInteger result=bd9.add(bd10);
        System.out.println(result);//3
        System.out.println(bd9);//1
    }
}
