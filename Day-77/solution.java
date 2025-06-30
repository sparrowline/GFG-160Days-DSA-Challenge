//A Binary Tree node
class Node4
{
    int data;
    Node4 left, right;
   Node4(int item)
   {
        data = item;
        left = right = null;
    }
} 

class Mirror {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node4 node) {
        // Your code here
        
        if(node == null) return;
            
            //swap left and right
            Node4 temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            //recur
            mirror(node.left);
            mirror(node.right);
        
    }
}