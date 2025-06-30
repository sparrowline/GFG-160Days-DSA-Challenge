import java.util.ArrayList;

// A Binary Tree node

class Node1 {
    int data;
    Node1 left, right;
   Node1(int item)    {
        data = item;
        left = right = null;
    }
}

class InOrder {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node1 root) {
        // Code
        
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(root,result);
        return result;
    }
    
    private void inorderTraversal(Node1 node,ArrayList<Integer> result){
        if(node == null ) return ;
        
        inorderTraversal(node.left,result); //left;
        result.add(node.data);
        inorderTraversal(node.right,result); //right;
    }
}