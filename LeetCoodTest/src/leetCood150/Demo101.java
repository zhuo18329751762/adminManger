package leetCood150;

public class Demo101 {
    /*
    给你一个二叉树的根节点 root ， 检查它是否轴对称。
     */
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }else {
            return isSameTree(root.left,root.right);
        }
    }
    public boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }else if(root1==null||root2==null){
            return false;
        }else if(root1.val!=root2.val){
            return false;
        }else{
            return isSameTree(root1.left,root2.right)&&isSameTree(root1.right,root2.left);
        }
    }
}
