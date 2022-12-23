package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //int的包装类Integer char的包装类Character
        ArrayList<Integer> list=new ArrayList<Integer>();
        //jdk5以后 int与integer可以互相转换
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1) {
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
