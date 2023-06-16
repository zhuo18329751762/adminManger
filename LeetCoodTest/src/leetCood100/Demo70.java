package leetCood100;

public class Demo70 {
    /*
    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     */

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a1=1;
        int a2=2;
        for (int i = 2; i < n; i++) {
            int temp=a1;
            a1=a2;
            a2=temp+a1;
        }
        return a2;

    }
}
