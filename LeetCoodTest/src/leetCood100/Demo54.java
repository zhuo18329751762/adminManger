package leetCood100;

import java.util.ArrayList;
import java.util.List;

public class Demo54 {
    /**
     * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     * @param args
     */
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1}};
        //int[][] matrix={{3},{2}};
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        //int len=matrix.length-1;
        int width=matrix[0].length-1;
        int hig=matrix.length-1;
        if(width==0){
            for (int i = 0; i < matrix.length; i++) {
                list.add(matrix[i][0]);
            }
        }else if(hig==0){
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[0][i]);
            }
        }
        int i=0;
        int count=0;
        int max=matrix[0].length*matrix.length;
        while (width>0&&hig>0){
            for (int num=i; num <= width&&count<max;num++) {
                //System.out.println(matrix[i][num]);
                list.add(matrix[i][num]);
                count++;
            }
            System.out.println();
            for(int num=i+1;num<=hig&&count<max;num++){
                //System.out.println(matrix[num][width]);
                list.add(matrix[num][width]);
                count++;
            }
            System.out.println();
            for(int num=width-1;num>=i&&count<max;num--){
                //System.out.println(matrix[hig][num]);
                list.add(matrix[hig][num]);
                count++;
            }
            System.out.println();
            for(int num=hig-1;num>i&&count<max;num--){
                //System.out.println(matrix[num][i]);
                list.add(matrix[num][i]);
                count++;
            }
            System.out.println();
            width--;
            hig--;
            i++;
        }
        return list;
    }
}
