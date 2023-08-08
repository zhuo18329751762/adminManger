package leetCood100;

import javax.swing.*;
import java.util.Arrays;

public class Demo {
    boolean flag=false;
    public  boolean exist(char[][] board, String word) {
        char begin=word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(begin==board[i][j]){
                    //此时遇到开头字母
                    boolean[][] mark=new boolean[board.length][board[i].length];
                    mark[i][j]=true;
                    search(board, i, j, word, 1,mark);
                    if(flag==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public  void search(char[][] board,int i,int j,String word,int index,boolean[][] mark){
        if(index==word.length()){
            flag=true;
            return;
        }
        //上
        if(i-1>=0){
            if(board[i-1][j]==word.charAt(index)&&mark[i-1][j]!=true){
                boolean[][] b=new boolean[board.length][board[0].length];
                for (int m = 0; m < mark.length; m++) {
                    for (int n = 0; n < mark[0].length; n++) {
                        b[m][n]=mark[m][n];
                    }
                }
                b[i-1][j]=true;
                search(board,i-1,j,word,index+1,b);
            }
        }
        //下
        if(i+1<board.length){
            if(board[i+1][j]==word.charAt(index)&&mark[i+1][j]!=true){
                boolean[][] b=new boolean[board.length][board[0].length];
                for (int m = 0; m < mark.length; m++) {
                    for (int n = 0; n < mark[0].length; n++) {
                        b[m][n]=mark[m][n];
                    }
                }
                b[i+1][j]=true;
                search(board,i+1,j,word,index+1,b);
            }
        }
        //左
        if(j-1>=0){
            if(board[i][j-1]==word.charAt(index)&&mark[i][j-1]!=true){
                boolean[][] b=new boolean[board.length][board[0].length];
                for (int m = 0; m < mark.length; m++) {
                    for (int n = 0; n < mark[0].length; n++) {
                        b[m][n]=mark[m][n];
                    }
                }
                b[i][j-1]=true;
                search(board,i,j-1,word,index+1,b);
            }
        }
        //右
        if(j+1<board[0].length){
            if(board[i][j+1]==word.charAt(index)&&mark[i][j+1]!=true){
                boolean[][] b=new boolean[board.length][board[0].length];
                for (int m = 0; m < mark.length; m++) {
                    for (int n = 0; n < mark[0].length; n++) {
                        b[m][n]=mark[m][n];
                    }
                }
                b[i][j+1]=true;
                search(board,i,j+1,word,index+1,b);
            }
        }
    }
}
