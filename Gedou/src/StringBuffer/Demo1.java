package StringBuffer;

public class Demo1 {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("菜鸟教程");
        s1.append("a");
        s1.append("b");
        s1.append("c");
        System.out.println(s1);
        userInfo1(s1);
        userInfo2(s1);
        String s="张胜男";
        s="无敌";
        System.out.println(s);
    }

    public static void userInfo1(StringBuffer stringBuffer) {
        stringBuffer.append("九转大肠");
        System.out.println(stringBuffer);
    }
    public static void userInfo2(StringBuffer stringBuffer) {
        stringBuffer.append("鸡你太美");
        System.out.println(stringBuffer);
    }
}
