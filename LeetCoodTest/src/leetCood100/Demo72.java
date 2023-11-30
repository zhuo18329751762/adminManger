package leetCood100;

public class Demo72 {
    /*
    给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。

你可以对一个单词进行如下三种操作：

插入一个字符
删除一个字符
替换一个字符

     */
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
    }

    public static int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] arr=new int[m+1][n+1];
        //对dp数组进行初始化
        for (int i = 1; i <= m; i++) {
            arr[i][0]=arr[i-1][0]+1;
        }
        for (int i = 1; i <= n; i++) {
            arr[0][i]=arr[0][i-1]+1;
        }
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=Math.min(Math.min(arr[i-1][j-1],arr[i-1][j]),arr[i][j-1])+1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr[m][n];
    }
}
