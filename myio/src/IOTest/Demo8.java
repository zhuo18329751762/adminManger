package IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Demo8 {
    /*
    将正确的用户名和密码手动保存在本地的userinfo.txt文件中
    保存格式为:username=zhangsan&password=123&count=0
    让用户录入的和正确的用户名密码是否一致
    如果一致则打印登陆成功
    如果不一致则打印登陆失败，连续输错三次被锁定
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("myio\\src\\IOTest\\userinfo.txt"));
        String str;
        ArrayList<Student1> list=new ArrayList<>();
        while ((str=br.readLine())!=null){
            String name=str.split("=")[1].split("&")[0];
            String password=str.split("=")[2].split("&")[0];
            int count = Integer.parseInt(str.split("=")[3]);
            list.add(new Student1(name,password,count));
        }
        br.close();
        System.out.println("请输入用户名");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入用户密码");
        String password = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                int count=list.get(i).getCount();
                if(count>2){
                    System.out.println("您的账号已被锁定");
                    break;
                }else if(!list.get(i).getPassword().equals(password)){
                    list.get(i).setCount(++count);
                    BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\src\\IOTest\\userinfo.txt"));
                    for (Student1 stu : list) {
                        bw.write(stu.toString());
                        bw.newLine();
                    }
                    bw.close();
                    System.out.println("用户名或密码输入错误!");
                    break;
                }else{
                    System.out.println("登陆成功");
                    BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\src\\IOTest\\userinfo.txt"));
                    for (Student1 stu : list) {
                        list.get(i).setCount(0);
                        bw.write(stu.toString());
                        bw.newLine();
                    }
                    bw.close();
                    break;
                }
            }
        }
    }
    }


