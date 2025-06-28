# Height of Binary Tree

---

## Problem Statement

Given the **root of a binary tree**, your task is to determine the **height** of the tree.

- The **height** of a binary tree is the **number of edges** on the longest path from the root node to any leaf node.
- A **leaf node** is defined as a node with no children.

---

## Examples

### Example 1

**Input:**  
`root[] = [12, 8, 18, 5, 11]`

**Output:**  
`2`

**Explanation:**  
The longest path from the root `12` to a leaf node is:  
`12 -> 8 -> 5`  
This path contains **2 edges**, so the height is `2`.

---

### Example 2

**Input:**  
`root[] = [1, 2, 3, 4, N, N, 5, N, N, 6, 7]`

**Output:**  
`3`

**Explanation:**  
The longest path from the root `1` to leaf node `6` goes through 3 edges:  
`1 -> 2 -> 4 -> 6`

---

## Constraints

- `1 <= number of nodes <= 10^5`
- `0 <= node->data <= 10^5`

---

## Java Implementation

```java
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class TreeHeight {
    public int height(TreeNode root) {
        if (root == null) return -1; // return -1 if height in terms of edges
        return 1 + Math.max(height(root.left), height(root.right));
    }
}