package Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //读取
        FileReader fr=new FileReader("E:\\测试\\c.txt");
        FileWriter fw=new FileWriter("E:\\测试\\排序.txt");

        StringBuilder sb=new StringBuilder();


        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        //排序
        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        //写出
        String s=Arrays.toString(arr).replace(",","-");
        String result=s.substring(1,s.length()-1);
        fw.write(result);
        fw.close();
        fr.close();
    }
}
