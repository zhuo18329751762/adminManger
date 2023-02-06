package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        需求：
            利用反序列化流/对象操作输入流，把一个对象读到程序中
         */
        // 1 创建反序列化对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myio\\f.txt"));
        // 2 读取
        int len;
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
