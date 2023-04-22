package leetCood50;

import java.util.Arrays;

public class Demo31 {

    /*
    整数数组的一个 排列 就是将其所有成员以序列或线性顺序排列。
例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。
更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。
如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
给你一个整数数组 nums ，找出 nums 的下一个排列。
必须 原地 修改，只允许使用额外常数空间。
     */

    public static void main(String[] args) {
        //int[] nums={1,3,2};//2 1 3
        int[] nums={2,3,1};//3 1 2
        //int[] nums={1,1,5};
        //int[] nums={2,8,7,6,2,1};//
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        if(nums.length<2){
            return ;
        }
        int i=nums.length-1;
        while (nums[i]<=nums[i-1]){
            i--;
            if(i==0) {
                //此时为最大数，需返回这个数组的逆序
                int num = nums.length - 1;
                int left = 0;
                while (num > (nums.length - 1) / 2) {
                    int temp = nums[num];
                    nums[num] = nums[left];
                    nums[left] = temp;
                    num--;
                    left++;
                }
                //程序结束
                return;
            }
        }
        //此时遇到的是左边的数字小于右边的数字，
        // 需要向右寻找在左边数字与右边数字范围之内的最小数字
        int min=i;
        for(int j=i-1;j<nums.length;j++){
            if(nums[min]>nums[j]&&nums[j]>nums[i-1]){
                min=j;
            }
        }
            //先交换
            int temp = nums[min];
            nums[min] = nums[i - 1];
            nums[i - 1] = temp;
        //再对这个点后的数据进行从小到大的排序
        for(int j=i;j<nums.length;j++){
            for(int k=i;k<nums.length-1;k++) {
                if (nums[k] > nums[k + 1]) {
                    //交换位置
                    int a = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = a;
                }
            }
        }
        return ;
    }
}
