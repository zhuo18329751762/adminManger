package Immutable;

import java.util.Iterator;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        /*
        创建不可变的list集合
        "张三"，”李四“，”王五“，”赵六“
         */
        //一旦创建成功，无法进行修改，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
