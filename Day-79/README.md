# Diameter of a Binary Tree

---

## Problem Statement

Given a **binary tree**, find its **diameter**, also known as the longest path between any two **leaf nodes**. The path may or may not pass through the **root**.

> **Diameter** = Maximum number of edges between any two nodes in the tree.

---

## Examples

### Example 1

**Input:**  
`root[] = [1, 2, 3]`

**Output:**  
`2`

**Explanation:**  
The longest path: `2 -> 1 -> 3`, which has **2 edges**.

---

### Example 2

**Input:**  
`root[] = [5, 8, 6, 3, 7, 9]`

**Output:**  
`4`

**Explanation:**  
The longest path: `3 -> 8 -> 5 -> 6 -> 9`, which has **4 edges**.

---

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ node->data ≤ 10^5`

---

## Approach

- Perform **post-order traversal**.
- At each node, calculate:
  - **Height of left subtree**
  - **Height of right subtree**
  - **Diameter through current node** = left height + right height
- Maintain a **global variable** to track the maximum diameter.

---

## Java Implementation

```java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class DiameterBinaryTree {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter at this node
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}