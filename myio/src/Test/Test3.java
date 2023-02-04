package Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    /*
    文本文件中有以下的数据
    2-1-9-4-7-8
    将文件中的数据进行排序，变成以下的数据
    1-2-4-7-8-9
     */
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
        String str=sb.toString();
        String[] arrstr = str.split("-");

        ArrayList<Integer> list=new ArrayList<>();
        for (String s : arrstr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        //写入
        list.sort((o1, o2) -> o1-o2);//正序排列
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            if(i!=list.size()-1){
                fw.write(list.get(i)+"-");
                continue;
            }
            fw.write(list.get(i)+"");
        }

        fw.close();
        fr.close();
    }
//    private char[] getSort(char[] arr){
//        String str=String.copyValueOf(arr);
//        String[] strs = str.split("-");
//        for (int i = 0; i < strs.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if(Integer.parseInt(strs[i])>Integer.parseInt(strs[j])){
//                    String temp=strs[j];
//                    strs[j]=strs[i];
//                    strs[i]=temp;
//                }
//            }
//        }
//        StringBuilder s=new StringBuilder(strs," ","-");
//    }
}
