package leetCood150;

import java.util.Arrays;

public class Demo130 {
    /*
    给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，
    找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
     */

    public static void main(String[] args) {
        char[][] board={
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};
        solve(board);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int m,n;
    public static void solve(char[][] board) {
        m=board.length;
        if(m==0){
            return;
        }
        n=board[0].length;
        for (int i = 0; i < m; i++) {
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for (int i = 1; i < n-1; i++) {
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]=='A'){
                    board[i][j]='O';
                }else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

    }
    public static void dfs(char[][] board,int x,int y){
        if(x<0||x>=m||y<0||y>=n||board[x][y]!='O'){
            return;
        }
        board[x][y] = 'A';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}
