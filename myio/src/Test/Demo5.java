package Test;

import java.io.*;
import java.util.Properties;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        /*
        Properties跟IO流结合的操作
         */
        // 1 创建集合
        Properties prop=new Properties();
        // 2 添加数据
        prop.put("aaa","vvv");
        prop.put("ccc","qqq");
        prop.put("ddd","www");
        prop.put("eee","bbb");
        // 3 把集合中的数据以键值对的形式写到本地文件中
        //BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\Test\\a.txt"));
        FileOutputStream fos=new FileOutputStream(new File("myio\\src\\Test\\a.txt"));
        prop.store(fos,"test");
    }
}
