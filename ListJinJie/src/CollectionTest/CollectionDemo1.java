package CollectionTest;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //List系列集合:添加的元素是有序、可重复、有索引
        //set系列集合:添加的元素是无序、不重复、无索引
        //Collection是一个接口，不能直接创建他的对象
        //所以，学习他的方法时，只能创建它实现类的对象
        //实现类:ArrayList
        Collection<String> coll=new ArrayList<>();
        // 1 添加元素
        //细节一 返回值的类型 如果我们要在List系列集合中添加数据，那么方法永远为true
        //因为List系列的是允许元素重复的
        //细节二 如果要往Set系列集合中添加元素，如果当前添加元素不存在，方法返回true
        //如果已经存在，方法返回false
        coll.add("张三");
        coll.add("李四");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);
        // 2 清空
//        coll.clear();
//        System.out.println(coll);
        // 3 删除
        // 细节一 因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除，只能通过元素的对象进行删除
        // 细节二 方法的返回值，删除成功返回true，删除失败返回false
        //如果要删除的元素不存在，就会删除失败
        coll.remove("李四");
        System.out.println(coll);
        // 4 判断元素是否包含
        //底层依赖equals方法进行判断是否存在
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，
        //那么在Javabean类中，一定要重写equals方法
        boolean result=coll.contains("张三");
        System.out.println(result);
        // 5 判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);//false
        // 6 获取集合的长度
        int size= coll.size();
        System.out.println(size);
    }
}
