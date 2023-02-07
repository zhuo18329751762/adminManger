package IOTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        制造假数据,在网上爬取
         */
        //百家姓：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        //男生名字http://www.haoming8.cn/baobao/10881.html
        //女生名字http://www.haoming8.cn/baobao/7641.html

        // 1 定义变量记录网址
        String familyNameNet=
                "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet="http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet="http://www.haoming8.cn/baobao/7641.html";

        // 2 爬取数据,把网址上的所有数据拼接成一个字符串
        String familyNameStr = wedCrawler(familyNameNet);
        String boyNameStr = wedCrawler(boyNameNet);
        String girlNameStr = wedCrawler(girlNameNet);
        // 3 通过正则表达式，把其中符合要求的数据获取出来
        String regex1="(.{4})(，|。)";
        String regex2="([\\u4E00-\\u9FA5]{2})(、|。)";//中文
        String regex3="(([\\u4E00-\\u9FA5]{2})(\\s)){4}[\\u4E00-\\u9FA5]{2}";
        //String regex4="(.. ){4}..";//泽欧、

        ArrayList<String> familyNameTempList= getDate(familyNameStr,regex1,1);
        //System.out.println(familyNameTempList);
        ArrayList<String> boyNameTempList= getDate(boyNameStr,regex2,1);
        //System.out.println(boyNameTempList);
        ArrayList<String> girlNameTempList= getDate(girlNameStr,regex3,0);
//        ArrayList<String> girlNameList2= getDate(girlNameStr,regex4,0);
//        System.out.println(girlNameTempList);
//        System.out.println(girlNameList2);

        // 4 处理数据

//        familyNameTempList
        //把每一种姓氏拆开并添加到一个新集合中
        ArrayList<String> familyNameList=new ArrayList<>();
        for (String s : familyNameTempList) {
            for (int i = 0; i < s.length(); i++) {
                familyNameList.add(s.charAt(i)+"");
            }
        }
        //System.out.println(familyNameList);

//        boyNameTempList
        //去重
        ArrayList<String> boyNameList=new ArrayList<>();
        for (String s : boyNameTempList) {
            if(!boyNameList.contains(s)){
                boyNameList.add(s);
            }
        }
        //System.out.println(boyNameList);

//        girlNameTempList
        ArrayList<String> girlNameList=new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                girlNameList.add(s2);
            }
        }

        // 5 生成数据
        //姓名(唯一) -性别-年龄
        ArrayList<String> list =
                getInfos(familyNameList, boyNameList, girlNameList, 100, 100);
        Collections.shuffle(list);
        System.out.println(list);
        // 6 写入本地
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:人名.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
    /*
    参数一：装着姓氏的集合
    参数二：装着男生姓名的集合
    参数三：装着女生姓名的集合
    参数四:男生的个数
    参数五:女生的个数

     */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,
                                             ArrayList<String> boyNameList,
                                             ArrayList<String> girlNameList,
                                             int boyCount,
                                             int girlCount)
    {
        // 1 生成不重复的名字
        HashSet<String> boyhs=new HashSet<>();
        HashSet<String> girlhs=new HashSet<>();
        //生成男生
        while (true){
            if(boyhs.size()==boyCount){
                break;
            }
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0)+boyNameList.get(0));
        }
        //生成女生
        while (true){
            if(girlhs.size()==girlCount){
                break;
            }
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0)+girlNameList.get(0));
        }
        //统一格式
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        //年龄[18~27]
        //男生
        for (String boyName : boyhs) {
            int age=r.nextInt(10)+18;
            list.add(boyName+"-男-"+age);
        }
        //女生
        //年龄[18~25]
        for (String girlName : girlhs) {
            int age=r.nextInt(8)+18;
            list.add(girlName+"-女-"+age);
        }
        return list;
    }

    /*
    根据正则表达式获取字符串中的数据
    参数一:完整的字符串
    参数二:正则表达式
    参数三:需要的内容索引
     */
    private static ArrayList<String> getDate(String str, String regex,int index) {
        // 1 创建集合存放数据
        ArrayList<String> list=new ArrayList<>();
        // 2 按照正则表达式筛选
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String group = matcher.group(index);
            list.add(group);
        }
        return list;
    }

    /*
    作用：从网络上爬取数据，把数据拼接成字符串并返回
    形参：网址
    返回值：爬取到的所有数据
     */
    public static String wedCrawler(String net) throws IOException {
        // 1 定义stringBuilder记录数据
        StringBuilder sb=new StringBuilder();
        // 2 创建一个URL对象
        URL url=new URL(net);
        // 3 链接上这个网址
        //要保证网络是畅通的，而且这个网址是可以链接上的
        URLConnection conn = url.openConnection();
        // 4 读取数据
        //将字节流转换为字符流
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch=isr.read())!=-1){
            sb.append((char) ch);
        }
        // 5 释放资源
        isr.close();
        // 6 把读取到的数据返回
        return sb.toString();
    }
}
