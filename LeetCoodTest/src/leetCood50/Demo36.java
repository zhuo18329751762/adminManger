package leetCood50;

import java.util.HashSet;
import java.util.Map;

public class Demo36 {
    /**
     * 请你判断一个9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
     * 数字1-9在每一行只能出现一次。
     * 数字1-9在每一列只能出现一次。
     * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
     * 注意：
     * 一个有效的数独（部分已被填充）不一定是可解的。
     * 只需要根据以上规则，验证已经填入的数字是否有效即可。
     * 空白格用'.'表示。
     */

    public static void main(String[] args) {
        String[][] board =
                {{"5", "3", ".", ".", "7", ".", ".", ".", "."},
                        {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                        {".", "9", "8", ".", ".", ".", ".", "6", "."},
                        {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                        {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                        {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                        {".", "6", ".", ".", ".", ".", "2", "8", "."},
                        {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                        {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(String[][] board) {
        HashSet<String> hang=new HashSet<>();
        HashSet<String> lie=new HashSet<>();
        HashSet<String> s1=new HashSet<>();
        HashSet<String> s2=new HashSet<>();
        HashSet<String> s3=new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            if(i%3==0){
                s1.clear();
                s2.clear();
                s3.clear();
            }
            for (int j = 0; j < board[0].length; j++) {
                String b=String.valueOf(board[i][j]);
                String c=String.valueOf(board[j][i]);
                //列
                if(!b.equals(".")){
                    if(!lie.contains(b)){
                        lie.add(b);
                    }else{
                        return false;
                    }
                }
                //行
                if(!c.equals(".")){
                    if(!hang.contains(c)){
                        hang.add(c);
                    }else{
                        return false;
                    }
                    //块
                    if(j/3==0){
                        if(!s1.contains(c)){
                            s1.add(c);
                        }else{
                            return false;
                        }
                    }else if(j/3==1){
                        if(!s2.contains(c)){
                            s2.add(c);
                        }else{
                            return false;
                        }
                    }else{
                        if(!s3.contains(c)){
                            s3.add(c);
                        }else{
                            return false;
                        }
                    }
                }
            }
            hang.clear();//清空
            lie.clear();//清空
        }
            return true;
    }
}