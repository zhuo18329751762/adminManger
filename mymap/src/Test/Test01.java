package Test;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) {
        //班级里有N个学生，实现随机点名器
        //定义集合
        ArrayList<String> list=new ArrayList<>();
        //添加元素
        Collections.addAll(list,"张三","李四","王五","赵六","刘七","小丽","小花","小倩");
        //打乱
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }

    }
}
