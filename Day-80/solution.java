class Node80 {
    int data;
    Node80 left;
    Node80 right;
    Node80(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class IsBST {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node80 root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(Node80 node, long min, long max) {
        if (node == null) return true;

        if (node.data <= min || node.data >= max) return false;

        return isValidBST(node.left, min, node.data) &&
               isValidBST(node.right, node.data, max);
    }
}