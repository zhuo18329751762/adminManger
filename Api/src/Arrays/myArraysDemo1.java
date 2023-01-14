package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class myArraysDemo1 {
    public static void main(String[] args) {
        Integer[] arr={4,1,2,5,8,7,9,6,3,10};
        //第二个参数是一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象
        //但是这个实现类，我们只使用一次，所以没有必要单独去写一个类，直接采取匿名内部类的方式就可以了
        //底层原理：
        //利用插入排序+二分查找的方式进行排序
        //默认把0索引的数据当做是有序的序列，1到最后都当做是无序的序列
        //遍历无序的序列得到里面的每一个元素，假设当前遍历到的元素是A元素
        //把A往有序序列中进行插入，在插入的时候,是利用二分查找确定A元素的插入点

        //compare方法的形式参数
        //参数一o1：表示在无序序列中，遍历得到的每一个元素
        //参数二o2：有序序列中的元素


        //简单理解
        //o1-o2 升序排列
        //o2-o1 降序排列
        //返回值
        //负数：表示当前要插入的元素是小的，放在前面
        //正数：表示当前要插入的元素是大的，放在后面
        //0:表示当前要插入的元素跟现在的元素比是一样的，也会放在后面
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1 "+o1);
                System.out.println("o2 "+o2);
                return o1-o2;
            }
        });
        System.out.println((Arrays.toString(arr)));
    }
}
