package leetCood150;

import javax.swing.*;

public class Demo112 {
    /*
    给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
    判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
    如果存在，返回 true ；否则，返回 false 。
叶子节点 是指没有子节点的节点。
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getPathSum(root,0,targetSum);
    }
    public boolean getPathSum(TreeNode root,int num,int targetSum){
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (num + root.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }
        return getPathSum(root.left, num + root.val, targetSum) || getPathSum(root.right, num + root.val, targetSum);
    }
}
