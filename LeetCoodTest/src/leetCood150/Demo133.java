package leetCood150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo133 {
    /*
    给你无向 连通 图中一个节点的引用，请你返回该图的 深拷贝（克隆）。

图中的每个节点都包含它的值 val（int） 和其邻居的列表（list[Node]）。
     */

    HashMap<ImageNode,ImageNode> visited=new HashMap<>();
    public ImageNode cloneGraph(ImageNode node) {
        if(node==null){
            return node;
        }
        //此时表示该节点已经访问过了
        
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        ImageNode clone=new ImageNode(node.val,new ArrayList());
        visited.put(node,clone);
        for(ImageNode neighbor:node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
class ImageNode {
    public int val;
    public List<ImageNode> neighbors;
    public ImageNode() {
        val = 0;
        neighbors = new ArrayList<ImageNode>();
    }
    public ImageNode(int _val) {
        val = _val;
        neighbors = new ArrayList<ImageNode>();
    }
    public ImageNode(int _val, ArrayList<ImageNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
