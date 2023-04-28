package Test;

public class 汉诺塔递归 {
    /**
     * 第一步:
     *  将n-1个模块，从A移动到B
     *  将n个模块，从A移动到C
     * 第二步：
     *  将n-1个模块，从B移动到C
     * @param n
     * @param a
     * @param b
     * @param c
     */
    public static void hanNuo(int n,String a,String b,String c){
        if(n==1){
            System.out.println(a+"移动到"+c);
        }else{
            hanNuo(n-1,a,c,b);//将n-1个移动到b
            System.out.println(a+"移动到"+c);
            hanNuo(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        hanNuo(64,"A","B","C");
    }
}
