package IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            一个文件里面存储了班级同学的姓名，每个姓名占一行
            要求通过程序实现随机点名器
        运行效果：
            被点到的学生不会再被点到
            如果班级中所有的学生都点完了，需要自动的重新开始第二轮点名
            细节一：假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
            细节二：第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二轮点名
         */
        BufferedReader br=
                new BufferedReader(new InputStreamReader(new FileInputStream("E:\\学生姓名.txt")));
        String str;
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Integer> numlist=new ArrayList<>();
        while((str=br.readLine())!=null){
            list.add(str);
        }
        Random r=new Random();
        int i=1;
        while (true){
            int index=r.nextInt(list.size());
            if(!numlist.contains(index)) {
                System.out.println(list.get(index));
                numlist.add(index);
            }
            if(numlist.size()==list.size()&&i<5){
                //将索引集合清空
                numlist.clear();
                i++;
                System.out.println("第"+i+"轮即将开始");
            }
        }
    }
}
