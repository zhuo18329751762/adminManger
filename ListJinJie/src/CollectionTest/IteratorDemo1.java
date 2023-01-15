package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        //迭代器的基础使用
        //迭代器的细节注意点
        /*
        1.报错NoSuchElementException
        2.迭代器遍历完毕，指针不会复位
        3.循环中只能用一次next方法
        4.迭代器遍历时，不能用集合的方法进行增加或者删除  要用迭代器中的remove方法进行删除 如果要添加暂时没有办法
         */
        // 1 创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        // 2 获取迭代器对象
        Iterator<String> it=coll.iterator();
        // 3 遍历
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
        //1.报错NoSuchElementException
        //当循环结束后，迭代器的指针已经指向了最后没有元素的位置
//        System.out.println(it.next());//NoSuchElementException
        //2.迭代器遍历完毕，指针不会复位
        System.out.println(it.hasNext());//指针不会复位
        //如果需要继续进行第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2=coll.iterator();
        while(it2.hasNext()){
            String str=it2.next();
            if("ccc".equals(str)){
                it2.remove();
            }
        }
        System.out.println(coll);
        //3.循环中只能用一次next方法
    }
}
