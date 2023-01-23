package Test;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    public static void main(String[] args) {
        //70%概率随机到男生
        //30%概率随机到女生
        //定义集合
        ArrayList<Integer> list=new ArrayList<>();
        //添加元素
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //打乱集合
        Collections.shuffle(list);
        int sex=list.get(0);
        //创建两个集合分别存储男生和女生的名字
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        Collections.addAll(boyList,"张三","李四","王五","赵六","刘七");
        Collections.addAll(girlList,"小丽","小花","小倩");
            if(sex==0){
                Collections.shuffle(girlList);
                System.out.println(girlList.get(0));
            }else{
                Collections.shuffle(boyList);
                System.out.println(boyList.get(0));
            }

    }
}
