package charstream;

import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("myio\\a.txt");

        int b1=fr.read();
        System.out.println(b1);

        int b2=fr.read();
        System.out.println(b2);

        int b3=fr.read();
        System.out.println(b3);

        int b4=fr.read();
        System.out.println(b4);

        fr.close();
    }
}
