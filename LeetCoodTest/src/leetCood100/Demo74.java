package leetCood100;

public class Demo74 {
    /*
    给你一个满足下述两条属性的 m x n 整数矩阵：
每行中的整数从左到右按非递减顺序排列。
每行的第一个整数大于前一行的最后一个整数。
给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        //int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = {{1}};
        System.out.println(searchMatrix(matrix, 1));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int temp=-1;
        for (int i = 0; i < m; i++) {
            if(matrix[i][n-1]>=target){
                temp=i;
                break;
            }
        }
        if(temp!=-1) {
            for (int i = 0; i < n; i++) {
                if (matrix[temp][i] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
