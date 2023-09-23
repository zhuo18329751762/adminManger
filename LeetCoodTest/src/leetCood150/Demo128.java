package leetCood150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo128 {
    /*
给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     */


    public static void main(String[] args) {
        int[] nums={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }

    //算法时间复杂度On
    public static int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        int i=1,max=1;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if(!set.contains(num-1)){
                while (set.contains(num+i)){
                    i++;
                }
                max=Math.max(max,i);
                i=1;
            }
        }
        return max;
    }


//    public static int longestConsecutive(int[] nums) {
//        if(nums.length<1){
//            return 0;
//        }
//        Arrays.sort(nums);
//        int max=1;
//        int count=1;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i+1]==nums[i]){
//                continue;
//            }
//            if(nums[i+1]-nums[i]==1){
//                count++;
//            }else{
//                max=Math.max(count,max);
//                count=1;
//            }
//        }
//        return Math.max(count,max);
//    }
}
