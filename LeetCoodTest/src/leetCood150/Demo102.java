package leetCood150;

import java.util.*;

public class Demo102 {
    /*
    给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
     */
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int i=queue.size();
            List<Integer> integerList=new ArrayList<>();
            for (int index = 0; index< i; index++) {
                TreeNode poll = queue.poll();
                integerList.add(poll.val);
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
            list.add(integerList);
        }
        return list;
    }
}
