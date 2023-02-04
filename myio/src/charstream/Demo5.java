package charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("myio\\a.txt");

        fw.write("你好");
        fw.write("我是张三");
//        fw.flush();//将缓存区的数据写入文件中

        fw.write("你好");
        fw.write("我是李四");
        fw.close();

    }
}
