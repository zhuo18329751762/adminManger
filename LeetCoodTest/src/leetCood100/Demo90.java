package leetCood100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo90 {
    /*
    给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
     */
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> integerList = new ArrayList<>();
        dfs(integerList, nums, 0);
        return list;
    }

    public void dfs(List<Integer> integerList, int[] nums, int index) {
        if (index == nums.length) {
            if (!list.contains(integerList)) {
                list.add(new ArrayList<>(integerList));
            }
            return;
        }
        integerList.add(nums[index]);
        dfs(integerList, nums, index + 1);
        integerList.remove(integerList.size() - 1);
        dfs(integerList, nums, index + 1);
    }
}
