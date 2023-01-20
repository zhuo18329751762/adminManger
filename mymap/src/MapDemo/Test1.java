package MapDemo;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        /*
        某个班级80名学生，现在需要组队秋游活动，班长提供了四个景点依次是(A,B,C,D),每个学生只能
        选择一个景点，请统计出最终哪个景点想去的人数最多
         */
        // 1 先让同学投票
        //定义一个数组，存放4个景点
        String[] arr={"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index=r.nextInt(arr.length);
            list.add(arr[index]);
        }
        // 统计
        //如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义Map集合，利用集合进行统计
        HashMap<String ,Integer > hm=new HashMap<>();
        for (String name : list) {
            //判断当前景点在map集合中是否存在
            if(hm.containsKey(name)){
                //存在
                //先获取已经投票的次数
                Integer count=hm.get(name);
                count++;
                hm.put(name,count);
            }else{
                //不存在
                hm.put(name,1);
            }
        }
        System.out.println(hm);
        //求最大值
        int max=0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer count = entry.getValue();
            if(count>max){
                max=count;
            }
        }
        System.out.println("最大次数是"+max);

        //判断哪个景点的次数和最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            if(max==entry.getValue()){
                String str=entry.getKey();
                System.out.println(str);
            }
        }

    }
}
