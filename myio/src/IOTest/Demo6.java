package IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
            一个文件里面存储了班级同学的姓名，每个姓名占一行
        要求1:每次被点到的学生，再次被点到的概率在原先的基础上降低一半
        举例：80个学生，点名5次。每次都点到小A，概率变化如下：
                第一次每人概率：1.25%
                第二次每人概率：0.625%          其他学生概率：1.2579%
                第三次每人概率：0.3125%         其他学生概率：1.261867%
                第四次每人概率：0.15625%        其他学生概率：1.2638449%
                第五次每人概率：0.078125%       其他学生概率：1.26483386%

                本体核心就是带权重的随机
         */
        // 1 把文件中的数据读取到内存中
        ArrayList<Student> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("myio\\a.txt"));
        String line;
        while ((line=br.readLine())!=null){
            String[] arr = line.split("-");
            Student s=new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(s);
        }
        br.close();
        // 2 计算权重总和
        double weight=0;
        for (Student stu : list) {
            weight = weight + stu.getWeight();
        }
            // 3 计算每一个人的实际占比
            double[] arr = new double[list.size()];
            int index = 0;
            for (Student stu : list) {
                arr[index] = stu.getWeight() / weight;
                index++;
            }
            // 4 计算每一个人的权重占比范围
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i - 1];
            }
            // 5 随机抽取
            //获取一个0.0~1.0的随机数
            double number = Math.random();
            //判断number在arr中的位置
            //二分查找法
            //方法返回:-插入点-1
            int index2 = Arrays.binarySearch(arr, number);
            index2 = -index2 - 1;
            Student stu=list.get(index2);
            System.out.println(index2);
            System.out.println(stu);
            // 6 修改当前学生的权重
            double w = stu.getWeight()/2;
            stu.setWeight(w);
            System.out.println(list);
            // 7 把集合中的数据再次写到文件中
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\a.txt"));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
        }
    }
