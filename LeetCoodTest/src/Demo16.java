import java.util.Arrays;

public class Demo16 {
    /*
    给你一个长度为 n 的整数数组nums和 一个目标值target。请你从 nums 中选出三个整数，使它们的和与target最接近。

返回这三个数的和。

假定每组输入只存在恰好一个解。
     */
    public static void main(String[] args) {
        int[] nums = {833,736,953,-584,-448,207,128,-445,126,248,871,860,333,-899,463,488,-50,-331,903,575,265,162,-733,648,678,549,579,-172,-897,562,-503,-508,858,259,-347,-162,-505,-694,300,-40,-147,383,-221,-28,-699,36,-229,960,317,-585,879,406,2,409,-393,-934,67,71,-312,787,161,514,865,60,555,843,-725,-966,-352,862,821,803,-835,-635,476,-704,-78,393,212,767,-833,543,923,-993,274,-839,389,447,741,999,-87,599,-349,-515,-553,-14,-421,-294,-204,-713,497,168,337,-345,-948,145,625,901,34,-306,-546,-536,332,-467,-729,229,-170,-915,407,450,159,-385,163,-420,58,869,308,-494,367,-33,205,-823,-869,478,-238,-375,352,113,-741,-970,-990,802,-173,-977,464,-801,-408,-77,694,-58,-796,-599,-918,643,-651,-555,864,-274,534,211,-910,815,-102,24,-461,-146};
        int i = threeSumClosest(nums, -7111);
        System.out.println(i);
    }
    public static int threeSumClosest(int[] nums, int target) {
        int sum=nums[0]+nums[1]+nums[2];
        int left,right;
        int len=nums.length;
        int max=10000000;
        Arrays.sort(nums);
        if(sum<=target){
            return sum;
        }
        for (int i = 0; i < len; i++) {
            if(i>0&&nums[i]==nums[i-1]) {
                continue;
            }
            left=i+1;
            right=len-1;
           while (left<right){
               sum=nums[i]+nums[left]+nums[right];
               if(sum==target){
                   return sum;
               }
               if(Math.abs(sum - target) < Math.abs(max - target)){
                   max=sum;
               }
//               if (sum > target) {
//                   // 如果和大于 target，移动 c 对应的指针
//                   int k0 = right - 1;
//                   // 移动到下一个不相等的元素
//                   while (j < k0 && nums[k0] == nums[k]) {
//                       --k0;
//                   }
//                   k = k0;
//               } else {
//                   // 如果和小于 target，移动 b 对应的指针
//                   int j0 = j + 1;
//                   // 移动到下一个不相等的元素
//                   while (j0 < k && nums[j0] == nums[j]) {
//                       ++j0;
//                   }
//                   j = j0;
               }
           }
        return sum;
    }
    public int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // 枚举 a
        for (int i = 0; i < n; ++i) {
            // 保证和上一次枚举的元素不相等
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 使用双指针枚举 b 和 c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // 如果和为 target 直接返回答案
                if (sum == target) {
                    return target;
                }
                // 根据差值的绝对值来更新答案
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // 如果和大于 target，移动 c 对应的指针
                    int k0 = k - 1;
                    // 移动到下一个不相等的元素
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // 如果和小于 target，移动 b 对应的指针
                    int j0 = j + 1;
                    // 移动到下一个不相等的元素
                    while (j0 < k && nums[j0] == nums[j]) {
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }
}

}
