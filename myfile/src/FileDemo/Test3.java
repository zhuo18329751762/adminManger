package FileDemo;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        /*
        找到电脑中所有以avi结尾的电影(需要考虑子文件夹)
         */
        File f=new File("C:\\");
        haveAVI(f);
    }
    public static boolean haveAVI(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    haveAVI(f);
                } else if (f.isFile()) {
                    if (f.getName().endsWith(".txt")) {
                        System.out.println(f.getName());
                    }
                }
            }
        }
            return false;
        }
}
