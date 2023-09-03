package leetCood150;

import java.util.*;

public class Demo103 {
    /*
    给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。
    （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }
        boolean flag=false;
        while (!queue.isEmpty()){
            int i=queue.size();
            Deque<Integer> integerList=new ArrayDeque<>();
            for (int index = 0; index< i; index++) {
                TreeNode poll = queue.poll();
                if(flag){
                    integerList.offerFirst(poll.val);
                }else{
                    integerList.offerLast(poll.val);
                }
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
            flag=!flag;
            list.add(new ArrayList<>(integerList));
        }
        return list;
    }
}
