package MapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //键:整数表示id
        //值:字符串表示商品名称
        //要求:按照id的升序排列,按照id的降序排序
        //Integer Double默认情况下都是按照升序排序的
        TreeMap<Integer,String> tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1表示当前要添加的元素
                //o2表示已经在红黑树中存在的元素
                return o2-o1;
            }
        });
        tm.put(2,"康帅傅");
        tm.put(1,"劫动");
        tm.put(4,"粤利粤");
        tm.put(3,"雷碧");
        tm.put(5,"九个核桃");
        //升序排列
        System.out.println(tm);
    }
}
