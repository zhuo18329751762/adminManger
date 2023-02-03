package FileDemo;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        File f=new File("E:\\测试\\eee");
        deleteFile(f);
    }
    public static void deleteFile(File file){
        File[] files = file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    f.delete();
                }else{
                    deleteFile(f);
                }
            }
            file.delete();
    }
}
