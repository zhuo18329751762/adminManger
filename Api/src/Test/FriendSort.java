package Test;

import java.util.Arrays;
import java.util.Comparator;

public class FriendSort {
    //定义数组存放一些人的信息，利用Arrays中的sort方法进行排序
    //属性要有姓名、年龄、身高
    //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序(姓名中不要包含中文或特殊字符)
    public static void main(String[] args) {
        Person p1=new Person("xiaoshishi",18,1.67);
        Person p2=new Person("xiaodandna",19,1.72);
        Person p3=new Person("xiaohuihui",19,1.78);
        Person p4=new Person("abc",19,1.78);
        Person[] arr={p1,p2,p3,p4};
        Arrays.sort(arr, ( o1,  o2)-> {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，
                // 身高一样按照姓名的字母进行排序(姓名中不要包含中文或特殊字符)
                double temp=o1.getAge()- o2.getAge();
                temp=temp==0?o1.getStature()-o2.getStature():temp;
                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
                if(temp>0){
                    return 1;
                }else if(temp<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        );
        System.out.println(Arrays.toString(arr));
    }
}
