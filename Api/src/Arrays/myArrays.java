package Arrays;

import java.util.Arrays;

public class myArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //binarySearch
        //二分查找的前提，数组中的元素必须是有序的，数组中的元素必须是升序的
        //如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是-插入点-1
        System.out.println("---------binarySearch----------");
        System.out.println(Arrays.binarySearch(arr,10));//9
        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,0));//-1
        System.out.println("----------copyOf---------------");
        int[] newArr1=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newArr1));
        //copyOfRange  包头不包尾
        System.out.println("----------copyOfRange---------------");
        int[] newArrays2=Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(newArrays2));//[1, 2, 3, 4, 5]
        //fill:填充数组
        System.out.println("----------fill---------------");
        Arrays.fill(arr,100);//将数组中的所有数据填充为100
        System.out.println(Arrays.toString(arr));
        //sort:排序 默认情况下，给基本数据类型进行升序排序
        System.out.println("----------sort---------------");
        int[] arr2={4,1,2,5,8,7,9,6,3,10};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));



    }
}
