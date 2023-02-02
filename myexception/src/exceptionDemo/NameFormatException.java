package exceptionDemo;

public class NameFormatException extends RuntimeException{
    //NameFormat :当前异常名字
    //Exception :表示当前类是一个异常类
    //运行时:RuntimeExpection   参数错误导致的异常
    //编译时:Exception 核心 提醒程序员检查本地信息


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
