package CodeSuiXiangLu;

import java.util.Scanner;

public class Demo10 {
    /*
    问题描述
　　给定一个序列 a[1], a[2], …, a[n] 和一个整数 k，请找出一个长度正好为 k 的区间，使得区间中所有数的和最大。
　　即要找到一个整数 p ，使得 1 <= p 且 p+k-1 <= n ，使得 a[p]+a[p+1]+...+a[p+k-1] 最大。
输入格式
　　输入的第一行包含两个整数 n , k。
　　第二行包含 n 个整数，相邻的整数之间使用一个空格分隔，表示给定的序列。
输出格式
　　输出一行包含一个整数，表示最大的区间和，你只需要输出和就行，不需要输出方案。
样例输入
6 3
2 3 9 1 9 5
样例输出
19
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr=new int[n];
        long[] temp=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        long a=0;
        for(int i=0;i<k;i++){
            a+=arr[i];
        }
        temp[k-1]=a;
        for(int i=k;i<n;i++){
            temp[i]=temp[i-1]+arr[i]-arr[i-k];
        }
        long max=0;
        for (int i = k-1; i < n; i++) {
            max=max>temp[i]?max:temp[i];
        }
        System.out.println(max);
    }
}
