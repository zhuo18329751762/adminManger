package leetCood100;


import java.util.Arrays;

public class Demo72 {
    /**
     给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
     */
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},
                          {3,4,5,2},
                          {1,3,1,5}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[][] mark=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    for (int a = 0; a <m; a++) {
                        mark[a][j]=true;
                    }
                    for (int b = 0; b <n; b++) {
                        mark[i][b]=true;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mark[i][j]==true){
                  matrix[i][j]=0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
