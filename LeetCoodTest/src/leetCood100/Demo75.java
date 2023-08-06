package leetCood100;

import java.util.Arrays;

public class Demo75 {
    /*
    给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，
    原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
必须在不使用库内置的 sort 函数的情况下解决这个问题。
     */
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, temp;
        for (int i = 0; i <= right;i++) {
            if (nums[i] == 2) {
                temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            }
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
            if(nums[i]==2){
                i--;
            }
        }
    }
}
