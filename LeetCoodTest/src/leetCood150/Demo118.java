package leetCood150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo118 {
    /*
    给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。

在「杨辉三角」中，每个数是它左上方和右上方的数的和。
     */
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0){
            return list;
        }
        Integer[] arr={1};
        list.add(Arrays.asList(arr));
        for(int i=1;i<numRows;i++){
            Integer[] num=new Integer[i+1];
            for (int j = 0; j < num.length; j++) {
                if(j!=0&&j!=num.length-1){
                    num[j]=arr[j-1]+arr[j];
                }else{
                    num[j]=1;
                }
            }
            list.add(Arrays.asList(num));
            arr=num;
        }
        return list;
    }
}
