package leetCood150;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Demo120 {
    /*
    给定一个三角形 triangle ，找出自顶向下的最小路径和。
每一步只能移动到下一行中相邻的结点上。
相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
     */
    public static void main(String[] args) {
        int a=010;
        System.out.println(a);
    }


    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
            }
            f[i][i] = f[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = f[n - 1][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[n - 1][i]);
        }
        return minTotal;
    }

    //暴力算法 超时
//    static int imunTotal=Integer.MAX_VALUE;
//    public static int minimumTotal(List<List<Integer>> triangle) {
//        if(triangle==null){
//            return 0;
//        }
//        dfs(triangle,0,0,0);
//        return imunTotal;
//    }
//    public static void dfs(List<List<Integer>> triangle,int i,int j,int total){
//        if(i>=triangle.size()){
//            imunTotal=imunTotal>total?total:imunTotal;
//            return;
//        }
//        if(j>=triangle.get(i).size()){
//            return;
//        }
//        total+=triangle.get(i).get(j);
//        dfs(triangle,i+1,j,total);
//        dfs(triangle,i+1,j+1,total);
//    }
}
