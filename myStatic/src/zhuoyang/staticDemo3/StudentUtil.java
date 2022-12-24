package zhuoyang.staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        int maxAge=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).getAge()>maxAge){
                maxAge=list.get(i).getAge();
            }
        }
        return maxAge;
    }
}
