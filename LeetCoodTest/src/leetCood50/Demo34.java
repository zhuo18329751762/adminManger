package leetCood50;

import java.util.Arrays;

public class Demo34 {
    /*
    给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回[-1, -1]。

你必须设计并实现时间复杂度为O(log n)的算法解决此问题。
     */

    public static void main(String[] args) {
        //int[] nums={5,7,7,8,8,10};
        int[] nums={1};
        int[] ints = searchRange(nums, 1);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        if(nums.length==0){
            return result;
        }
        int left=0;
        int right=nums.length-1;
        int mid;
        while (left<=right){
            mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid;
                right=mid;
                while (nums[left]==target){
                    if(left>0) {
                        left--;
                    }else{
                        result[0]=left;
                        break;
                    }
                }
                while (nums[right]==target){
                    if(right<nums.length-1) {
                        right++;
                    }else{
                        result[1]=right;
                        break;
                    }
                }
                if(result[0]==-1) {
                    result[0] = left + 1;
                }
                if(result[1]==-1) {
                    result[1] = right - 1;
                }
                return result;
            }
        }
        return result;
    }
}
