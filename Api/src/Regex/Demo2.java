package Regex;

public class Demo2 {
    public static void main(String[] args) {
        //验证手机号码
        //验证座机电话号码
        //验证邮箱号码

        //13112345678
        String regx1="1[3~9]\\d{9}";
        System.out.println("13112345678".matches(regx1));
        System.out.println("12112345678".matches(regx1));
        System.out.println("03112345678".matches(regx1));
        //座机号码
        //020-2324242[\\d&&[^0]]
        String regx2="0[\\d&&[^0]]\\d-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regx2));//true
        System.out.println("0202324242".matches(regx2));//true
        System.out.println("000-2324242".matches(regx2));//false
        //邮箱号码
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dleiooo9@pci.com.cn
        String regx3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-z[A-Z]]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regx3));
        System.out.println("zhangsan@itcast.cnn".matches(regx3));
        System.out.println("dlei0009@163.com".matches(regx3));
        System.out.println("dleiooo9@pci.com.cn".matches(regx3));
        String regex4="([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        //23:11:11
        System.out.println("23:11:11".matches(regex4));



    }
}
