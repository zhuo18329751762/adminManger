package Generics;


import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {
    }

    //    参数一：集合
//    参数二：最后要添加的元素
    public static <E> void addAll(ArrayList<E> list, E...e) {
        for (E e1 : e) {
        list.add(e1);
        }

    }

    public void show() {
        System.out.println("张三");
    }
}


