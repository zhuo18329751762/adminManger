package FileOutputStream;

public class Demo2 {
    public static void main(String[] args) {
        /*
        字节输出流的细节：
            1；创建字节输出流对象
                    细节1：参数是字符串表示的路径或者是File对象都是可以的
                    细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
                    细节3；如果文件已经存在，则会清空文件
            2：写数据
                    细节：writer方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
                    97-->a
            3:释放资源
                    每次使用完流之后都要释放资源

         */
    }
}
