import java.util.Arrays;

public class Demo26 {
    /*
    给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
将最终结果插入nums 的前 k 个位置后返回 k 。
不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        removeDuplicates1(arr);
    }
    public static int removeDuplicates1(int[] nums){
    if(nums ==null||nums.length ==0)return 0;
    int p = 0;
    int q = 1;
    while(q<nums.length)
    {
        if (nums[p] != nums[q]) {
            nums[p + 1] = nums[q];
            p++;
        }
        q++;
    }
    return p +1;
}


    public static int removeDuplicates(int[] nums) {
        int k=nums.length;
        int temp;
        for (int i = 0; i < k-1; i++) {
            for(int j = i+1; j < k-1; j++) {
                //遇到与这一位相等的数，就将这一位数移到最后一位
                if (nums[j] == nums[i]) {
                    //将i+1位移到最后一位，并将k-1
                    for (int m = j + 1; m < k - 1; m++) {
                        temp = nums[m];
                        nums[m] = nums[m + 1];
                        nums[m + 1] = temp;
                    }
                    //k--;
                }
            }
        }
        System.out.println(Arrays.toString(nums)+"最后一位"+nums[k-1]);
        return 0;
    }
}
