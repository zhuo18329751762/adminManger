package leetCood50;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
    /*
    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

算法的时间复杂度应该为 O(log (m+n)) 。
     */
    public static void main(String[] args) {
        int[] nums1={1,2,5};
        int[] nums2={3,4};
        double med = findMedianSortedArrays(nums1, nums2);
        System.out.println(med);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for (int i = 0; i < n1; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int n3=n1+n2;
        if((n3)%2==0){
            double result=(list.get(n3/2-1)+list.get(n3/2))/2.0;
            return result;
        }else{
            return list.get(n3/2);
        }
    }
}
