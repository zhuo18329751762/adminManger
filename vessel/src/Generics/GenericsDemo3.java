package Generics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*
        泛型不具备继承性，但是数据具备继承性
         */
        //创建集合的的对象
        ArrayList<ye> list1=new ArrayList<>();
        ArrayList<fu> list2=new ArrayList<>();
        ArrayList<zi> list3=new ArrayList<>();
        method(list1);
//        method(list2);
//        method(list3);
        list1.add(new ye());
        list1.add(new fu());
        list1.add(new zi());
    }
    /*
    泛型里面写的是什么类型，那么只能传递什么类型的数据
     */
    public static void method(ArrayList<ye> list){

    }
}
class ye{}
class fu extends ye {}
class zi extends fu{}