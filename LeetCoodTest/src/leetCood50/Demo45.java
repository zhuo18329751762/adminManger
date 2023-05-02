package leetCood50;

import java.util.ArrayList;

public class Demo45 {
    /*
    给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。

每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:

0 <= j <= nums[i]
i + j < n
返回到达nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
     */
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,2,3};
        int jump = jump(nums);
        System.out.println(jump);
    }
    public static int jump(int[] nums) {
        int length = nums.length-1;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("当前能到达的最大距离"+end+"当前能到达的距离"+(i+nums[i])+"当前索引为"+i);
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
                System.out.println("===================当前步数为"+steps);
            }
        }
        return steps;
    }
}
