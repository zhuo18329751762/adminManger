package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        字符输入流：
            构造方法：
                public BUfferedReader(Reader r)
            特有方法：
                public String readLine()  读一整行
         */

        // 1 创建字符缓冲输入流的对象
        BufferedReader br=new BufferedReader(new FileReader("myio\\copy.txt"));
        // 2 读取数据
//        /*
//        readLine方法在读取的时候，一次读一整行，遇到回车换行结束
//        但是不会把回车换行读到内存中
//         */
//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
