package leetCood150;

import java.util.ArrayList;
import java.util.List;

public class Demo113 {

    /*
    给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。

叶子节点 是指没有子节点的节点。
     */
    /*
    力扣官方题解
     List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ret;
    }

    public void dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }
     */

    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> integerList=new ArrayList<>();
        getPaths(root,0,targetSum,integerList);
        return list;
    }
    public void getPaths(TreeNode root,int sum,int targetSum,List<Integer> integerList){
        if (root == null) {
            return ;
        }
        integerList.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum + root.val == targetSum) {
                list.add(new ArrayList<>(integerList));
                return ;
            } else {
                return ;
            }
        }
        getPaths(root.left,sum+ root.val,targetSum,new ArrayList<>(integerList));
        getPaths(root.right,sum+ root.val,targetSum,new ArrayList<>(integerList));
    }
}
