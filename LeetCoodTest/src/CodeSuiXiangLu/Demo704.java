package CodeSuiXiangLu;

public class Demo704 {
    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
     * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     */
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int index=(right+left)/2;
            if(nums[index]==target){
                return index;
            }else if(nums[index]>target){
                right=index-1;
            }else{
                left=index+1;
            }
        }
        return -1;
    }
}
