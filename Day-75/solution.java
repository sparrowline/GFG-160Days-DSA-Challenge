import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Node1 {
    int data;
    Node1 left, right;

    Node1(int item) {
        data = item;
        left = right = null;
    }
}

class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(Node1 root) {
        // Your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            
            for(int i = 0;i<size;i++){
                Node1 current = queue.poll();
                level.add(current.data);
                
                if(current.left !=null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            result.add(level);
        }
        return result;
    }
}