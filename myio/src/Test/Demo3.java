package Test;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        实现一个验证程序运行次数的小程序，要求如下：
         1.当程序运行超过第三次时给出提示：本软件只能免费使用三次，欢迎您注册会员后继续使用
         2.程序运行演示如下：
                第一次运行控制台：欢迎使用本软件，第一次使用免费~
                第二次运行控制台：欢迎使用本软件，第二次使用免费~
                第三次运行控制台：欢迎使用本软件，第三次使用免费~
                第四次及之后运行控制台输出：本软件只能免费使用三次，欢迎您注册会员后继续使用
         */
        //方法一
//        FileReader fr=new FileReader("myio\\次数.txt");
//        FileWriter fw=new FileWriter("myio\\次数.txt",true);
//        int num = fr.read();
//        if(num==-1){
//            System.out.println("欢迎使用本软件，第一次使用免费~");
//            fw.write("1");
//        }else if(num>=49&&num<=51){
//            FileWriter fw1=new FileWriter("myio\\次数.txt");
//            fw.write((char)++num);
//            fw1.close();
//        }
//        if(num>49&&num<=51) {
//          System.out.println("第" +(char)num + "次运行控制台：欢迎使用本软件，第" + (char)num + "次使用免费~");
//        }
//       else if(num!=-1){
//            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
//        }
//        fw.close();
//        fr.close();
        //方法二
        BufferedReader br=new BufferedReader(new FileReader("myio\\次数.txt"));
        String str = br.readLine();
        br.close();
        int count = Integer.parseInt(str);
        count++;
        if(count<=3){
            System.out.println("欢迎使用本软件，第"+count+"次使用免费~");
        }else{
            System.out.println("本软件只能免费使用三次，欢迎您注册会员后继续使用");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\次数.txt"));
        bw.write(count+"");
        bw.close();
    }
}
