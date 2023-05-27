package leetCood100;

import java.util.ArrayList;
import java.util.List;

public class Demo59 {

    /**
     * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
     */
    public static void main(String[] args) {
        int[][] ints = generateMatrix(2);
        System.out.println("主");
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.printf("%3d",ints[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int count=1;
        int[][] arr=new int[n][n];
        int len=n;
        int num=0;
        while (count<=n*n){
            //上
            for(int i=num;i<len;i++){
                arr[num][i]=count;
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
            //右
            for(int i=num+1;i<len;i++){
                arr[i][len-1]=count;
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
            //下
            for(int i=len-2;i>num;i--){
                arr[len-1][i]=count;
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
            //左
            for(int i=len-1;i>num;i--){
                arr[i][num]=count;
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
            len--;
            num++;
        }
        return arr;
    }
}
