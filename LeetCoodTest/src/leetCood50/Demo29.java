package leetCood50;

public class Demo29 {

    /*
    给你两个整数，被除数dividend和除数divisor。将两数相除，要求 不使用 乘法、除法和取余运算。

整数除法应该向零截断，也就是截去（truncate）其小数部分。例如，8.345 将被截断为 8 ，-2.7335 将被截断至 -2 。

返回被除数dividend除以除数divisor得到的 商 。

注意：假设我们的环境只能存储 32 位 有符号整数，其数值范围是 [−231, 231− 1] 。
本题中，如果商 严格大于 231− 1 ，则返回 231− 1 ；如果商 严格小于 -231 ，则返回 -231 。
     */


    public static void main(String[] args) {
        //int divide = divide(-2147483648, -1);
        //System.out.println(divide);

    }

//    public static int divide(int dividend, int divisor) {
//        if(dividend==0){
//            return 0;
//        }
//        long result=0;
//        int flag=0;
//        if(dividend>0&&divisor>0){
//            flag=1;
//        }else if(dividend<0&&divisor<0){
//            flag=1;
//            dividend=-dividend;
//            divisor=-divisor;
//        }
//        else if(dividend<0){
//            flag=-1;
//            dividend=-dividend;
//        }else{
//            flag=-1;
//            divisor=-divisor;
//        }
//        while (dividend-divisor>=0){
//            dividend=dividend-divisor;
//            result++;
//        }
//        if(result*flag>Integer.MAX_VALUE){
//            return Integer.MAX_VALUE;
//        }
//        if(result*flag<Integer.MIN_VALUE){
//            return Integer.MIN_VALUE;
//        }
//        return (int) (flag*result);
//    }

    public int divide(int dividend, int divisor) {
        long jg = (long)dividend / (long)divisor;
        if(jg > 0) {
            return jg > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) jg;
        }
        return (int) jg;
    }
}
