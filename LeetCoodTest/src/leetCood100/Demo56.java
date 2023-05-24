package leetCood100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo56 {
    /**
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
     */
    public static void main(String[] args) {
        int[][] intervals = {{4,5},{1,4},{0,1}};
        int[][] merge = merge(intervals);
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
//        for (int i = 0; i < merge.length; i++) {
//            for (int j = 0; j < merge[i].length; j++) {
//                System.out.print(merge[i][j]+" ");
//            }
//            System.out.println();
//        }
    }

    public static int[][] merge(int[][] intervals) {
        //对数组进行排序(按照左范围)
        for(int j=0;j<intervals.length;j++) {
            for (int i = 0; i < intervals.length-1; i++) {
                if (intervals[i][0] > intervals[i + 1][0]) {
                    int[] temp = intervals[i + 1];
                    intervals[i + 1] = intervals[i];
                    intervals[i] = temp;
                }
            }
        }
        List<int[]> list=new ArrayList<>();
        //遍历数组
        for (int i = 0; i < intervals.length; i++) {
            int left=intervals[i][0];
            int right=intervals[i][1];
            if(list.size()==0||left>list.get(list.size()-1)[1]){
                //list为空或者当前范围小于left
                list.add(new int[]{left,right});
            }else{
                list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],right);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
