package leetCood50;


import java.util.*;

public class Demo40 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List<List<Integer>> lists = combinationSum2(arr, 30);
        System.out.println(lists);
    }
    /*
    给定一个候选人编号的集合candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。

candidates中的每个数字在每个组合中只能使用一次。
     */



    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len=candidates.length;
        if(len==0){
            return null;
        }
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        Deque<Integer> path=new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return res;
    }
    public static void dfs(int[] candidates, int begin, int len,int target, Deque<Integer> path,List<List<Integer>> res){
        if(target==0){
            if(!res.contains(new ArrayList<>(path))){
                res.add(new ArrayList<>(path));
            }
            return ;
        }
        for(int i=begin;i<len;i++){
            if(i>begin&&candidates[i-1]==candidates[i]){
                //此时后面的索引不会有满足条件的
                continue;
            }
            if(candidates[i]<=target) {
                path.addLast(candidates[i]);
                dfs(candidates, i + 1, len, target - candidates[i], path, res);
                path.removeLast();
            }else{
                break;
            }
        }
    }
}
