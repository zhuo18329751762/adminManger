package leetCood100;

import java.util.Arrays;

public class Demo88 {
    /*
给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，
另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，
应忽略。nums2 的长度为 n 。
     */
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1=m-1,l2=n-1;
        while (l1>=0&&l2>=0){
            nums1[l1+l2+1]=nums1[l1]<=nums2[l2]? nums2[l2--]:nums1[l1--];
        }
        while (l2>=0){
            nums1[l1+l2+1]=nums2[l2--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
