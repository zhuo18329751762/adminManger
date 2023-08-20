package leetCood100;

import java.util.ArrayList;
import java.util.List;

public class Demo93 {
    /*
    有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。

例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，
但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，
这些地址可以通过在 s 中插入 '.' 来形成。你 不能 重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。
     */
    private List<String> list=new ArrayList<>();
    private int[] segments =new int[4];
    public List<String> restoreIpAddresses(String s) {
        segments =new int[4];
        dfs(s,0,0);
        return  list;
    }
    public void dfs(String s,int segId,int segStart){
        if(segId==4){
            if(segStart==s.length()) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < 4; i++) {
                    sb.append(segments[i]);
                    if (i != 3) {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            return ;
        }
        if(segStart==s.length()){
            return;
        }
        if(s.charAt(segStart)=='0'){
            segments[segId]=0;
            dfs(s,segId+1,segStart+1);
        }
        int num=0;
        for (int segEnd  = segStart; segEnd  < s.length(); segEnd ++) {
            num=num*10+(s.charAt(segEnd )-'0');
            if(num>0&&num<=255){
                segments[segId]=num;
                dfs(s,segId+1,segEnd+1);
            }else{
                break;
            }
        }
    }
}
