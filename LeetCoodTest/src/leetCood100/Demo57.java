package leetCood100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo57 {
    /**
     * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
     * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
     */
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,11};
        int[][] insert = insert(intervals, newInterval);
        for (int i = 0; i < insert.length; i++) {
            for (int j = 0; j < insert[i].length; j++) {
                System.out.print(insert[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int l=newInterval[0];
        int r=newInterval[1];
        List<int[] > list=new ArrayList<>();
        boolean flag=false;
        for (int i = 0; i < intervals.length; i++) {
            int left=intervals[i][0];
            int right=intervals[i][1];
            if(left>r){
                if(!flag){
                    list.add(new int[]{l,r});
                    flag=true;
                }
                list.add(new int[]{left,right});
            }else if(right<l){
                list.add(new int[]{left,right});
            }else{
                l=Math.min(l,left);
                r=Math.max(r,right);
            }
        }
        if(!flag){
            list.add(new int[]{l,r});
        }
        return list.toArray(new int[list.size()][]);
    }
}
