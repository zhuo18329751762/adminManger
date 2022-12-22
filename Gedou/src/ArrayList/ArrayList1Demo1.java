package ArrayList;

import java.util.ArrayList;

public class ArrayList1Demo1 {
    public static void main(String[] arg){
        //1 创建集合的对象
        //JDK7以前        ArrayList<String> list=new ArrayList<String>();
        //之后如下
        //<>表示泛性
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //ArrayList类型会用【】将内部的数据包裹起来

    }
}
