package leetCood100;

public class Demo63 {
    /**
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
     *
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
     *
     * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
     *
     * 网格中的障碍物和空位置分别用 1 和 0 来表示。
     */

    public static void main(String[] args) {
        //int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
//        int[][] obstacleGrid = {{0,1},{0,0}};
//        int[][] obstacleGrid = {{0,0}};
        //int[][] obstacleGrid = {{1,0},{0,0}};
        int[][] obstacleGrid = {{0,0},{1,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int n=obstacleGrid.length;//行
        int m=obstacleGrid[0].length;//列
        if(m==1||n==1){
            if(m==1){
                for (int i = 0; i < n; i++) {
                    if(obstacleGrid[i][0]==1){
                        return 0;
                    }
                }
                return 1;
            }else{
                for (int i = 0; i < m; i++) {
                    if(obstacleGrid[0][i]==1){
                        return 0;
                    }
                }
                return 1;
            }
        }
        int[][] dp=new int[n][m];
        dp[0][0]=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j==0&&i!=0){
                    if(obstacleGrid[i][j]==1){
                        dp[i][j]=0;
                        continue;
                    }
                    dp[i][j]=dp[i-1][j];
                }
                if(i==0&&j!=0){
                    if(obstacleGrid[i][j]==1){
                        dp[i][j]=0;
                        continue;
                    }
                    dp[i][j]=dp[i][j-1];
                }
                 if(i!=0&&j!=0) {
                    if (obstacleGrid[i][j] != 1) {
                        //不是障碍物
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    } else {
                        //是障碍物
                        dp[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
        return dp[n-1][m-1];
    }
}
