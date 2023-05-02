package leetCood50;

import java.util.ArrayList;
import java.util.List;

public class Demo46 {
    /*
    给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     */
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }
    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return null;
        }
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        getList(nums,used,0,list,res);
        return res;
    }
    public static void getList(int[] nums,boolean[] used,int count,List<Integer> list,List<List<Integer>> res){
        if(count==nums.length){
          res.add(new ArrayList<>(list));
           return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]!=true) {
                list.add(nums[i]);
                used[i]=true;
                getList(nums, used,count+1, list, res);
                list.remove(list.size() - 1);
                used[i]=false;
            }
        }
    }
}
