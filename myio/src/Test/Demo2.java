package Test;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;
import java.util.function.BiConsumer;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        把出师表的文章顺序进行恢复到一个新文件中
         */
        BufferedReader br=new BufferedReader(new FileReader("myio\\c.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\恢复.txt"));


        //方法一：
        String str;
        TreeMap<Integer,String> tm=new TreeMap<>();
        while((str=br.readLine())!=null){
            String[] arr = str.split("\\.");
            int key=Integer.parseInt(arr[0]);
            tm.put(key,str);
        }
        //写入
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }

        //方法二：
//        String str;
//        ArrayList<String> list=new ArrayList<>();
//        while((str=br.readLine())!=null){
//            list.add(str);
//        }
//        //定义排序规则
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i1 = Integer.parseInt(o1.split("\\.")[0]);
//                int i2 = Integer.parseInt(o2.split("\\.")[0]);
//                return i1-i2;
//            }
//        });
//        //写入文件
//        for (String s : list) {
//            bw.write(s);
//            bw.newLine();
//        }
        bw.close();
        br.close();
    }
}
