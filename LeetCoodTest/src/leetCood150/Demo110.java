package leetCood150;

public class Demo110 {
    /*
    给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
     */

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            return Math.abs(getHeight(root.left)-getHeight(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
        }
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int left=getHeight(root.left);
            int right=getHeight(root.right);
            return Math.max(left,right)+1;
        }
    }
}
