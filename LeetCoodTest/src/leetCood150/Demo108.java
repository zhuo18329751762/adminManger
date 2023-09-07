package leetCood150;

public class Demo108 {
    /*
    给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。

高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
     */

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null){
            return null;
        }
        return buildTree(nums,0,nums.length-1);
    }
    public TreeNode buildTree(int[] nums,int left,int right){
        if(right<left){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode treeNode=new TreeNode(nums[mid]);
        treeNode.left=buildTree(nums,left,mid-1);
        treeNode.right=buildTree(nums,mid+1,right);
        return treeNode;
    }
}
