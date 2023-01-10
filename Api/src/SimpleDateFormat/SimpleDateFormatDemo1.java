package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // 1 定义一个字符串表示时间
        String str="2023-1-10 11:11:11";
        // 2 利用空参构造创建SimpleDateFormat对象，对象格式要和字符串格式一模一样，否则会报错
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);


    }

    private static void method() {
        // 1 空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d=new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);
        // 2 代参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String str1 = sdf1.format(d);
        System.out.println(str1);
    }
}
