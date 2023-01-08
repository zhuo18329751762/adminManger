package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // 1 加法
        BigDecimal bd1=new BigDecimal(10.0);
        BigDecimal bd2=new BigDecimal(3);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        // 2 减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);
        // 3 乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);
        // 4 除法
        //BigDecimal bd6 = bd1.divide(bd2);//如果除不尽就会报错
        BigDecimal bd6 = bd1.divide(bd2,2, RoundingMode.HALF_UP);//如果除不尽就会报错
        //up远离0方向的舍入模式
        //down像零方向的舍入模式
        //CEILING向正无穷大方向的舍入模式
        //FLOOR向负无穷大的方向的舍入模式
        //HALF_UP四舍五入的舍入模式
        //HALF_DOWN与四舍五入类似，但是5是舍去的
        System.out.println(bd6);


    }
}
