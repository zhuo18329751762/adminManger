package leetCood100;

import java.util.*;

public class Demo78 {
    /*
    给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
     */
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> integerList=new ArrayList<>();
        get(integerList,nums,list,0);
        return list;
    }
    public static void get(List<Integer> integerList,int[] nums,List<List<Integer>> list,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(integerList));
            return;
        }
            integerList.add(nums[index]);
            get(integerList,nums,list,index+1);
            integerList.remove(integerList.size()-1);
            get(integerList,nums,list,index+1);
    }
}
