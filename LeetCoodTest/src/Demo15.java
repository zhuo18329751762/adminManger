import java.util.*;

public class Demo15 {
    /*
    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请

你返回所有和为 0 且不重复的三元组。

注意：答案中不可以包含重复的三元组。

     */
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        int left,right;
        for (int i = 0; i < len; i++) {
            if(i>0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            left=i+1;
            right=len-1;
            while (left<right){
                int num=nums[i]+nums[left]+nums[right];
                if(num==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while (nums[left] == nums[left + 1]) {
                            left++;
                            if(left==len-1){
                                break;
                            }
                        }
                        left++;
                }else if(num>0){
                    right--;
                }else if(num<0){
                    left++;
                }
            }
        }
        return list;
    }
}
