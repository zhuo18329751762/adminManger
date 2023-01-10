package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiaoKill {
    public static void main(String[] args) throws ParseException {
        String str1="2023年11月11日 0:01:00";
        String str2="2023年11月11日 0:11:0";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = sdf1.parse(str1);
        Date date2 = sdf1.parse(str2);
        Date date3 = sdf1.parse("2023年 11月11日 0:0:0");
        Date date4 = sdf1.parse("2023年 11月11日 0:10:0");

        miaoSha(date3,date4,date1);
        miaoSha(date3,date4,date2);
    }

    private static void miaoSha(Date d1,Date d2,Date d3) {
        if(d3.getTime()>= d1.getTime()&&d3.getTime()<= d2.getTime()){
            System.out.println("参加了");
        }else{
            System.out.println("没参加");
        }
    }

}
