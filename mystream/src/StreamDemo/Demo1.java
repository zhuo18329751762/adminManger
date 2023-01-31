package StreamDemo;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        /*
        创建集合添加元素，完成以下需求
        1 把所有以 张 开头的元素存储到新集合中
        2 把 张 开头的，长度为3的元素再存储到新集合中
        3 遍历打印最终结果
         */
        ArrayList<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周志南");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

//        //1 把所有以 张 开头的元素存储到新集合中
//        ArrayList<String> list1=new ArrayList<>();
//        for (String name : list) {
//            if(name.startsWith("张")){
//                list1.add(name);
//            }
//        }
//        System.out.println(list1);
//        //2 把 张 开头的，长度为3的元素再存储到新集合中
//        ArrayList<String> list2=new ArrayList<>();
//        for (String name : list1) {
//            if(name.length()==3){
//                list2.add(name);
//            }
//        }
//        System.out.println(list2);
    }
}
