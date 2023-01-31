package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"张无忌","周志南","赵敏","张强","张三丰","张翠山","张亮","王二麻子","谢广坤");
        //获取 "张强" “张三丰” “张翠山”
        list.stream().skip(3)
                .limit(3)
                .forEach(s-> System.out.println(s));
    }
}
