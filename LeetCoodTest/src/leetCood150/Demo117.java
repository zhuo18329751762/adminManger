package leetCood150;

import java.util.LinkedList;
import java.util.Queue;

public class Demo117 {


    /*
    给定一个二叉树：

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL 。

初始状态下，所有 next 指针都被设置为 NULL 。
     */
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int i=queue.size();
            //表示前一个结点
            Node pre=null;
            for(int index=0;index<i;index++){
                Node poll=queue.poll();
                if(pre!=null){
                    pre.next=poll;
                }
                pre=poll;
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
        }
        return root;
    }
}
