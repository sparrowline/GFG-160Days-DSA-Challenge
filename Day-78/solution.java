import java.util.ArrayList;

// A Binary Tree node

class Node3 {
    int data;
    Node3 left, right;
   Node3(int item)    {
        data = item;
        left = right = null;
    }
}

class InOrder {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node3 root) {
        // Code
        
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(root,result);
        return result;
    }
    
    private void inorderTraversal(Node3 node,ArrayList<Integer> result){
        if(node == null ) return ;
        
        inorderTraversal(node.left,result); //left;
        result.add(node.data);
        inorderTraversal(node.right,result); //right;
    }
}