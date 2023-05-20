package leetCood100;

public class Demo55 {
    /**
     * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
     *
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     *
     * 判断你是否能够到达最后一个下标。
     * @param args
     */
    public static void main(String[] args) {
        //int[] nums = {2,3,1,1,4};
        //int[] nums = {3,2,1,0,4};
        int[] nums = {2,0,0};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int maxArrive=0;
        for (int i = 0; i < nums.length; i++) {
            if(i<=maxArrive){
                maxArrive=Math.max(maxArrive,i+nums[i]);
                if(maxArrive>=nums.length-1){
                    return true;
                }
            }
        }
        return false;
    }

}
