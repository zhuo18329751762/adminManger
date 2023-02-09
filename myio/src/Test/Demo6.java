package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        /*
        Properties跟IO流结合的操作 读取
         */
        // 1 创建集合
        Properties prop=new Properties();
        // 2 读取本地Properties文件里面的数据
        FileInputStream fis=new FileInputStream("myio\\src\\Test\\a.txt");
        prop.load(fis);
        fis.close();
        // 3 打印集合
        System.out.println(prop);
    }
}
