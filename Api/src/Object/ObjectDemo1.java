package Object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        // 1 toString 返回对象的字符串表示形式
        Object obj=new Object();
        String str1=obj.toString();
        System.out.println(str1);
        // 2 equals 比较两个对象是否相等
        // 如果没有重写equals方法 就会使用Object中的方法进行比较 它比较的是地址值
        //所以一般需要重写
        Student s1=new Student("张三",18);
        Student s2=new Student("张三",17);
        boolean flag=s1.equals(s2);
        System.out.println(flag);
    }
}
