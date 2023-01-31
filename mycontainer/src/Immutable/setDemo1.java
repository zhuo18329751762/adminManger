package Immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setDemo1 {
    public static void main(String[] args) {
        /*
        创建不可变的set集合
        "张三"，”李四“，”王五“，”赵六“
        当要获取一个Set集合时，里面的内容一定要保证唯一性
         */
        //一旦创建成功，无法进行修改，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
        //添加，删除，修改都会报错
        //set.add("zhan");
    }
}
