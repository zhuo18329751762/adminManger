package leetCood50;

public class Demo50 {
    /**
     * 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
    public static double myPow(double x, int n) {
        if(n==0||x==1.0){
            return 1;
        }
        boolean flag=n<0;
        double result=1.0;
        while (n!=0){
            System.out.println("n="+n+"  x="+x);
            if(Math.abs(n)%2==1){
                result*=x;
            }
            x*=x;
            n=n/2;
        }
        if(flag){
            result=1/result;
        }
        return result;
    }
}
