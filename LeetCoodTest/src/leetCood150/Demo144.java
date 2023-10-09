package leetCood150;

import java.util.ArrayList;
import java.util.List;

public class Demo144 {
    /*
    给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
     */

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        pre(root,list);
        return list;
    }
    public void pre(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }
}
