package leetCood150;

import java.util.*;

public class Demo107 {
    /*
    给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int i=queue.size();
            List<Integer> integerList=new ArrayList<>();
            for (int index = 0; index < i; index++) {
                TreeNode poll=queue.poll();
                integerList.add(poll.val);
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
            list.add(0,integerList);
        }
        return list;
    }
}
