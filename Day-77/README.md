# Mirror Tree

---

## Problem Statement

Given a **binary tree**, your task is to convert it into its **mirror tree**.

- The **mirror** of a binary tree is a tree where **left and right children of all non-leaf nodes are interchanged**.

---

## Examples

### Example 1

**Input:**  
`root[] = [1, 2, 3, N, N, 4]`

**Output:**  
`[1, 3, 2, N, 4]`

**Explanation:**  
In the mirrored tree, node `1` has its children `2` and `3` swapped. Node `3` also now has child `4`.

---

### Example 2

**Input:**  
`root[] = [1, 2, 3, 4, 5]`

**Output:**  
`[1, 3, 2, N, N, 5, 4]`

**Explanation:**  
Each non-leaf node has its children reversed:  
- `1` → children `[3, 2]`  
- `2` → children `[5, 4]`  

---

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^5`

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

public class MirrorBinaryTree {

    public TreeNode mirror(TreeNode root) {
        if (root == null) return null;

        // Swap left and right
        TreeNode temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);

        return root;
    }
}