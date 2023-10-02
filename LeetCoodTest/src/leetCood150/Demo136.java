package leetCood150;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo136 {
    /*
    给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            return integer;
        }
        return 0;
    }
}
