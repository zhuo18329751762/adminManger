package leetCood100;

import java.util.Arrays;
import java.util.List;

public class Demo_90_Test {
    public static void main(String[] args) {
        Demo90 demo90=new Demo90();
        int[] nums={0};
        List<List<Integer>> list = demo90.subsetsWithDup(nums);
        System.out.println(list);
    }
}
