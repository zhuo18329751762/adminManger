package Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        拷贝一个文件夹，考虑子文件
         */
        File f1=new File("E:\\测试");
        File f2=new File("E:\\拷贝");
        copy(f1,f2);

    }
    private static void copy(File file,File copyFile) throws IOException {
        copyFile.mkdirs();
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                //是文件
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream fos=new FileOutputStream(new File(copyFile,f.getName()));
                int len;
                byte[] arr=new byte[1024];
                while ((len=fis.read(arr))!=-1){
                    fos.write(arr,0,len);
                    System.out.println("写入");
                }
                fos.close();
                fis.close();
            }
            else {
                //是文件夹
                copy(f,new File(copyFile,f.getName()));
            }
        }
    }
}
