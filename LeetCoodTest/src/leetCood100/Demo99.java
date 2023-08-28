package leetCood100;

import java.util.ArrayList;
import java.util.List;

public class Demo99 {
    public static void main(String[] args) {

    }
    public static void recoverTree(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int[] ints = get(list);
        recover(ints[0],ints[1],root);
    }

    public static void recover(int x,int y, TreeNode root) {
        if(null==root){
            return;
        }
        if(root.val==x||root.val==y){
            root.val= root.val==x?y:x;
        }
        recover(x,y,root.left);
        recover(x,y,root.right);
    }

    public static void inorder(TreeNode root, List<Integer> list){
        if(null==root){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static int[] get(List<Integer> list){
        int index1=-1,index2=-2;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i+1)< list.get(i)){
                index2=i+1;
                if(index1==-1){
                    index1=i;
                }
            }
        }
        int x=list.get(index1);
        int y=list.get(index2);
        return new int[]{x,y};
    }
}
