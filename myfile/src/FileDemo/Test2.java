package FileDemo;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        /*
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影
         */
        File f1=new File("E:\\测试\\b");
        boolean b = haveAVI(f1);
        System.out.println(b);
    }
    public static boolean haveAVI(File f){
        //进入aaa文件夹，并且获取里面所有的内容
        File[] files = f.listFiles();
        //遍历数组，获取里面每一个元素
        for (File file : files) {
            System.out.println(file.getName());
            if(file.isFile()&&file.getName().endsWith(".txt")){
                return true;
            }
        }
        return false;
    }
}
