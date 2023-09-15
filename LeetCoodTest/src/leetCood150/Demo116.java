package leetCood150;

import java.util.ArrayDeque;
import java.util.Queue;

/*
给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。
 */
public class Demo116 {
    public Node connect(Node root) {
        Queue<Node> Queue=new ArrayDeque<>();
        if(root!=null){
            Queue.add(root);
        }
        while(!Queue.isEmpty()){
            int i=Queue.size();
            for(int index=0;index<i;index++){
                Node poll =Queue.poll();
                if(index<i-1){
                    poll.next=Queue.peek();
                }
                if(poll.left!=null){
                    Queue.add(poll.left);
                }
                if(poll.right!=null){
                    Queue.add(poll.right);
                }
            }
        }
        return root;
    }
}
