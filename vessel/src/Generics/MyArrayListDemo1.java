package Generics;

public class MyArrayListDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list.toString());
    }

}
