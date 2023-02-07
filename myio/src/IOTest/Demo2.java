package IOTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        需求：有一个文件里面存储了班级同学的信息，每一个信息占一行
        格式为:张三-男-23
        要求通过程序实现随机点名器

        运行效果：
            第一次运行程序：随机同学姓名1(只显示名字)
            第一次运行程序：随机同学姓名2(只显示名字)
            第一次运行程序：随机同学姓名3(只显示名字)
            ...
         */
        BufferedReader br=new
                BufferedReader(new InputStreamReader(new FileInputStream("E:\\人名.txt")));
        String str;
        ArrayList<String> list=new ArrayList<>();
        while ((str=br.readLine())!=null){
            list.add(str.split("-")[0]);
        }
        Collections.shuffle(list);
        System.out.println(list.get(0));
        br.close();
    }
}
