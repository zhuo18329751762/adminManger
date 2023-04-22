package leetCood50;

public class Demo9 {
    /*
    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
     */
    public static void main(String[] args) {
        boolean flag = isPalindrome(0);
        System.out.println(flag);
    }
    public static boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0||(x%10)==0&&x!=0){
            return false;
        }
        int a=x;
        int num=0;
        while (x>0){
            num=num*10+x%10;
            x=x/10;
        }
        return a==num;
    }
}
