package Math;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs 获取参数的绝对值
        System.out.println(-88);
        System.out.println(Math.abs(-88));
        //abs的 bug
        //以int类型为例 取值范围 -2147483648~2147483647
        //如果没有正数与负数对应 那么传递的负数结果有误
        //-2147483648没有对应的正数，所以abs会产生bug
        System.out.println(Math.abs(-2147483648));//-2147483648
        //解决方法
        //Math.absExact 超出范围会进行报错
        //System.out.println(Math.absExact(-2147483648));

        //ceil
        //进一法 往数轴右边进1
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0
        System.out.println("-----------------------------------");

        //去尾法 往数轴左边退1
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0
        System.out.println("-----------------------------------");


        //四舍五入
        System.out.println(Math.round(12.34));//12.0
        System.out.println(Math.round(12.54));//13.0
        System.out.println(Math.round(-12.34));//-12.0
        System.out.println(Math.round(-12.54));//-13.0
        System.out.println("-----------------------------------");


        //获取两个整数的较大值
        System.out.println(Math.max(5,6));//6
        System.out.println(Math.min(5,6));//5
        System.out.println("-----------------------------------");


        //获取a的b次幂
        System.out.println(Math.pow(2,3));//8.0
        System.out.println("-----------------------------------");

        //开平方
        System.out.println(Math.sqrt(4));//2.0
        // 开三次方
        System.out.println(Math.cbrt(8));//2.0
        System.out.println("-----------------------------------");

        //获取随机数
        //范围[0.0,1.0)
        for (int i = 0; i < 10; i++) {
            //1~100的随机数
            System.out.println(Math.floor(Math.random()*100)+1);
        }
    }
}
