package leetCood150;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo137 {
    /*
    给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。

你必须设计并实现线性时间复杂度的算法且使用常数级空间来解决此问题。
     */

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> integers = map.keySet();
        for(Integer key:integers) {
            Integer integer = map.get(key);
            if (integer == 1) {
                return key;
            }
        }
            return 0;
    }
}
