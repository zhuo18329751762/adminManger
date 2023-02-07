package IOTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        需求：有一个文件里面存储了班级同学的信息，每一个信息占一行
        格式为:张三-男-23
        要求通过程序实现随机点名器

        运行效果：
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果
            注意观察:看生成男生和女生的比例是不是接近7:3
         */
        BufferedReader br=new
                BufferedReader(new InputStreamReader(new FileInputStream("E:\\人名.txt")));
        String str;
        ArrayList<String> boylist=new ArrayList<>();
        ArrayList<String> girllist=new ArrayList<>();
        while ((str=br.readLine())!=null){
            String[] arr = str.split("-");
            if(arr[1].equals("男")){
                boylist.add(arr[0]);
            }
            if(arr[1].equals("女")){
                girllist.add(arr[0]);
            }
        }
        br.close();
        Random r=new Random();
        int boy=0;
        int girl=0;
        String name;
        for (int i = 0; i < 1000000; i++) {
            int num=r.nextInt(10)+1;
            if(num<=3){
                Collections.shuffle(girllist);
                name=girllist.get(1);
                girl++;
            }else{
                Collections.shuffle(boylist);
                name= boylist.get(1);
                boy++;
            }
            System.out.println(name);
        }
        System.out.println("男生次数"+boy+"女生次数"+girl);
    }
}
