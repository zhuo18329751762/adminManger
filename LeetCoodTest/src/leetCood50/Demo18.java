package leetCood50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo18 {
    /**
     * 给你一个由 n 个整数组成的数组nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组[nums[a], nums[b], nums[c], nums[d]]（若两个四元组元素一一对应，则认为两个四元组重复）：
     * <p>
     * 0 <= a, b, c, d< n
     * a、b、c 和 d 互不相同
     * nums[a] + nums[b] + nums[c] + nums[d] == target
     * 你可以按 任意顺序 返回答案
     */
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> lists = fourSum(nums, target);
        System.out.println(lists);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return lists;
        }
        //排序
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                //跳过相等的数
                continue;
            }
            //四个int整数相加有可能会超出int取值范围
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                //此时不可能存在满足条件的四个数
                //退出
                break;
            }
            if ((long) nums[i] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) {
                //直接跳过本次循环 此时的i不会满足条件
                continue;
            }
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    //四个数字不能重复 跳过
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    //跳过
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[len - 2] + nums[len - 1] < target) {
                    continue;
                }
                //此时用双指针法来对剩下的两个索引进行筛选g
                int left = j + 1;
                int right = len - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        //将结果存入集合
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        //将left与right的都移动到不与当前值相等的位置
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                    } else {
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    }
                }
            }
        }
        return lists;
    }
}
