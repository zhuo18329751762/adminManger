package bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        字符输出流
        构造方法：
            pubic BufferedWriter(Writer r)
        特有方法:
            public void newLine() 跨平台运行
         */
        // 1 创建对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\c.txt",true));
        // 2 写入
        bw.write("张三");
        bw.newLine();
        bw.write("李四");

        // 3 关闭
        bw.close();
    }
}
