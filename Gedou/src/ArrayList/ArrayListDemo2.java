package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    /*
    boolean add(E e)  添加

    boolean remove(E e)  删除
    E remove(int index)

    E set(int index,E,e)  修改

    E get(int index)  查询
    int size()  获取长度
     */
    public static void main(String[] args) {
        // 1 创建对象
        ArrayList<String> list=new ArrayList<>();
        // 2 添加元素
        boolean result= list.add("aaa");//返回值为boolean类型
        System.out.println(result);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        System.out.println(list);
        // 3 删除元素
//        list.remove("abc");//返回值为Boolean类型，删除成功返回true 失败false
//        System.out.println(list);
        //根据索引进行删除
        list.remove(2);
        System.out.println(list);
        //

        // 4 修改元素
        list.set(2,"111");//2表示索引 111表示修改后的元素
        System.out.println(list);

        // 5 查询元素
        String s=list.get(2);
        System.out.println(s);
        // 6 遍历
        //长度获取 list.size();
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            System.out.println(str);
        }


    }
}
