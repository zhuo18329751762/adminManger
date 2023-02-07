package IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            一个文件里面存储了班级同学的姓名，每个姓名占一行
            要求通过程序实现随机点名器
            第三次必定是张三同学
        运行效果：
            第一次运行程序:随机同学姓名1
            第一次运行程序:随机同学姓名2
            第一次运行程序:张三
         */
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\学生姓名.txt")));
        BufferedReader br2=new BufferedReader(new InputStreamReader(new FileInputStream("myio\\次数.txt")));

        String str = br2.readLine();
        br2.close();
        int num = Integer.parseInt(str);
        if(Integer.parseInt(str)==2){
            System.out.println("张三");
        }else {
            String name;
            ArrayList<String> nameList = new ArrayList<>();
            while ((name = br.readLine()) != null) {
                nameList.add(name);
            }
            br2.close();
            Collections.shuffle(nameList);
            System.out.println(nameList.get(0));
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("myio\\次数.txt")));
        num++;
        bw.write(num+"");
        bw.close();
    }
}
