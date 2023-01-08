package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {
        // 1 通过传递double类型的小数来创建对象
        //这种方式可能是不精确的 不建议使用
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd2=new BigDecimal(0.090);
        System.out.println(bd1);
        System.out.println(bd2);
        // 2 通过传递字符串表示的小数来创建对象
        //较为精确
        BigDecimal bd3=new BigDecimal("0.01");
        BigDecimal bd4=new BigDecimal("0.09");
        BigDecimal bd5=bd4.add(bd3);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);
        // 3 通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        //细节
        // 1 如果表示的数字不大，没有超出double的范围 建议使用静态方法获取对象
        // 2 若果要表示的数字比较大，建议使用构造方法
        // 3 如果我们传递的数字是0~10，包含0,10；那么方法会直接返回创建好的对象。不会重新new

    }
}
