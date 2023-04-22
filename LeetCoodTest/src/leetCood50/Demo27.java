package leetCood50;

import java.util.Arrays;

public class Demo27 {
    /**
     * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * @param args
     */

    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int[] nums1 ={3,2,2,3};
        int i = removeElement(nums, 2);
        //int i = removeElement(nums1, 3);
        System.out.println(i);
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1) {
            if (nums[0] != val) {
                return 1;
            } else {
                return 0;
            }
        }
        int left=0;
        int right=0;
        for (int i = 0; i < nums.length; i++,right++) {
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[left-1]);
        return left;
    }
}
