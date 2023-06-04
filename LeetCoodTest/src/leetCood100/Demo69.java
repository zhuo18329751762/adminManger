package leetCood100;

public class Demo69 {
    /*
    给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
     */
    public static void main(String[] args) {
        System.out.println(Math.sqrt(2147483647));
        int i = mySqrt(2147483647);
        System.out.println(i);
//        long a=2147483647;
//        long b=a*a;
//        System.out.println(b);

    }
    public static int mySqrt(int x) {
        if(x<1){
            return 0;
        }
        int pre=0;
        long temp=x;
        while (x>=1){
            if(temp*temp>x){
                System.out.println("循环上");
                temp=temp/2;
                if(pre!=0){
                    return pre;
                }
            }else{
                System.out.println("循环");
                pre=(int)temp;
                temp++;
            }
        }
//        for (int i = 1; i <= x; i++) {
//            if(i*i==x){
//                return i;
//            }
//            if(i*i<x){
//                pre=i;
//            }
//            if(i*i>x){
//                return pre;
//            }
//        }
        return 0;
    }
}
