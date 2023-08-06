package leetCood100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo77 {
    /*
    给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
你可以按 任何顺序 返回答案。
     */
    List<List<Integer>> integerList=new ArrayList<>();
    public  List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        get(n,k,list,1);
        return integerList;
    }
    public  void get(int n, int k,List<Integer> list,int index){
        if(list.size()==k){
            integerList.add(list);
            return ;
        }
        for (int i = index; i <= n; i++) {
            list.add(i);
            get(n,k,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
