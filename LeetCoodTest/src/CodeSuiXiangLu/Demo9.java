package CodeSuiXiangLu;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int r=sc.nextInt()-1;
        int c=sc.nextInt()-1;
        int[][] dp=new int[m][n];
        dp[r][c]=1;//1表示可以到达
        biaoJi(r,c,dp,arr);
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dp[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //标记可以到达的地方 r c表示当前位置
    public static void biaoJi(int r,int c,int[][] dp,int arr[][]){
        //上
        if(r>0&&dp[r-1][c]!=1){
            boolean flag = panDuanGongYueShu(arr[r - 1][c], arr[r][c]);
            if(flag){
                dp[r-1][c]=1;
                biaoJi(r-1,c,dp,arr);
            }
        }
        //下
        if(r<arr.length-1&&dp[r+1][c]!=1){
            boolean flag = panDuanGongYueShu(arr[r +1][c], arr[r][c]);
            if(flag){
                dp[r+1][c]=1;
                biaoJi(r+1,c,dp,arr);
            }
        }
        //左
        if(c>0&&dp[r][c-1]!=1){
            boolean flag = panDuanGongYueShu(arr[r][c-1], arr[r][c]);
            if(flag){
                dp[r][c-1]=1;
                biaoJi(r,c-1,dp,arr);
            }
        }
        //右
        if(c<arr[0].length-1&&dp[r][c+1]!=1){
            boolean flag = panDuanGongYueShu(arr[r][c+1], arr[r][c]);
            if(flag){
                dp[r][c+1]=1;
                biaoJi(r,c+1,dp,arr);
            }
        }
    }
    //判断两个数最大公约数是否大于一
    public static boolean panDuanGongYueShu(int m,int n){
        if(m==1||n==1){
            return false;
        }
        int a=m>n?n:m;
        for(int i=2;i<=a;i++){
            if(m%i==0&&n%i==0){
                return true;
            }
        }
        return false;
    }
}
