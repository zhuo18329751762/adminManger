package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        //将2000-11-11 转换成2000年11月11日
        String str="2000-11-11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        String newDate = sdf1.format(date);
        System.out.println(newDate);
    }
}
