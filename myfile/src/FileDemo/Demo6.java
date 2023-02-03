package FileDemo;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {
        //public File[] listFiles()     获取当前路径下的所有内容

        //创建File对象
        File f=new File("E:\\测试");
        //listFiles()方法
        //获取b文件夹中的所有内容
        File[] files = f.listFiles();
        for (File file : files) {
            //file依次表示测试文件夹中的所有东西
            System.out.println(file);
        }
    }
}
