package ZiFuChuan;

public class CreatString {
    public static void main(String[] args) {
        //1 直接赋值方式 获取一个字符串对象
        String s1="abc";
        System.out.println(s1);

        //2 new的方式获取一个字符串对象
        //空参构造   可以获取一个 空白字符串 对象
        String s2=new String();
        System.out.println("@"+s2+"1");

        //3 传递一个字符串 根据传递的字符串内容创建一个新的字符串对象
        //此方法多此一举
        String s3=new String("abc");
        System.out.println(s3);

        //4 传递一个字符数组 根据传递的字符串内容在创建一个新的字符串对象
        //需求场景 修改字符串的内容
        char[] chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println(s4);

        //5 传递一个字节数组 根据字节数组内容在创建一个新的字符串对象
        //应用场景:在网络中传输的数据其实都是字节信息
        //将字节信息转换为字符串
        byte[] bys={97,98,99,100};
        String s5=new String(bys);
        //将97,98,99,100转换为assc对应的字符
        System.out.println(s5);
    }
}
