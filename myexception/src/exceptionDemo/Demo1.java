package exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
//        //编译时异常(在编译阶段，必须要手动处理，否则代码会报错)
//        String time="2030年1月1日";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
//        Date date=sdf.parse(time);
//        System.out.println(date);

        //运行时异常 ArrayIndexOutOfBoundsException
//        int[] arr={1,2,3};
//        System.out.println(arr[3]);
    }
}
