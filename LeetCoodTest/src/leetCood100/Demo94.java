package leetCood100;

import java.util.ArrayList;
import java.util.List;

public class Demo94 {
    //给定一个二叉树的根节点 root ，返回 它的 中序 遍历
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        prologueTraversal(root,list);
        return list;
    }
    public void prologueTraversal(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        prologueTraversal(root.left,list);
        list.add(root.val);
        prologueTraversal(root.right,list);
    }
}
