
class Node2
{
    int data;
    Node2 left, right;

    Node2(int item)
    {
        data = item;
        left = right = null;
    }
}
 




class Height {
    // Function to find the height of a binary tree.
    int height(Node2 node) {
        // Base case: empty node has height -1 (no edges)
        if (node == null) return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Height = 1 + max of left and right subtree heights
        return 1 + Math.max(leftHeight, rightHeight);
    }
}