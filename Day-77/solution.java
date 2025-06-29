//A Binary Tree node
class Node1
{
    int data;
    Node1 left, right;
   Node1(int item)
   {
        data = item;
        left = right = null;
    }
} 

class Mirror {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node1 node) {
        // Your code here
        
        if(node == null) return;
            
            //swap left and right
            Node1 temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            //recur
            mirror(node.left);
            mirror(node.right);
        
    }
}