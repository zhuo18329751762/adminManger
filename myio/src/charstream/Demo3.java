package charstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        //Write  写

        FileWriter fw=new FileWriter("myio\\a.txt");

        fw.write("你好啊？爱的速递");

        fw.close();
    }
}
