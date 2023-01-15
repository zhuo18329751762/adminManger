package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 1 创建集合的对象
        Collection<Student> coll=new ArrayList<>();
        //创建三个学生对象
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",28);
        //添加
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        //判断集合中某一个学生对象是否包含
        Student s4=new Student("lisi",23);
        //如果同姓名同年龄，就认为是同一个学生
        System.out.println(coll.contains(s4));
    }
}
