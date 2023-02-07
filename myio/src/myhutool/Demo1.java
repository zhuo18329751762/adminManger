package myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    /*
    FileUtil类:
        file:根据参数创建一个file对象
        touch：根据参数创建文件

        writerLines：把集合中的数据写到文件中，覆盖模式
        appendlines：把集合中的数据写出到文件中，续写模式
        readLines：指定字符编码，把文件中的数据，读到集合中
        readUtf8Lines:按照UTF-8的形式，把文件中的数据，读到集合中

        copy:拷贝文件或者文件夹
     */
    public static void main(String[] args) {
        File file = FileUtil.file("E:\\", "测试", "f", "测试1", "测试2", "www.txt");
        System.out.println(file);//E:\测试\f\测试1\测试2\斯巴达哈珀的加号.txt

//        File touch = FileUtil.touch(file);//若为多级目录，将自动创建
//        System.out.println(touch);

//        ArrayList<String> list=new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        FileUtil.writeLines(list,file,"UTF-8");//第四个参数决定是否覆盖,默认追加写入

//        ArrayList<String> list=new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        File file1 = FileUtil.appendLines(list, file, "UTF-8");//默认追加写入
//        System.out.println(file1);

        List<String> list = FileUtil.readLines(file, "UTF-8");
        System.out.println(list);

    }
}
