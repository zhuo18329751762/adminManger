package FileDemo;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        在当前模块下的aaa文件夹中创建一个a.txt文件
         */
        File f1=new File("myfile\\aaa");
        boolean b1 = f1.mkdir();
        File f2=new File(f1,"b.txt");
        boolean b2 = f2.createNewFile();
        System.out.println(b1);
        System.out.println(b2);
    }
}
