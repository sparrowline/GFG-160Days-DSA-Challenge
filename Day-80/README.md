# Check for BST (Binary Search Tree)

---

## Problem Statement

Given the **root of a binary tree**, determine whether it satisfies the properties of a **Binary Search Tree (BST)**.

> A valid BST is defined as:
> - The left subtree of a node contains only nodes with keys **less than** the node's key.
> - The right subtree of a node contains only nodes with keys **greater than** the node's key.
> - Both left and right subtrees must also be BSTs.
> - **Duplicates are not allowed.**

---

## Examples

### Example 1

**Input:**  
`root = [2, 1, 3, N, N, N, 5]`

**Output:**  
`true`  

**Explanation:**  
All left children < root and all right children > root. Tree follows BST properties.

---

### Example 2

**Input:**  
`root = [2, N, 7, N, 6, N, 9]`

**Output:**  
`false`  

**Explanation:**  
Node with value 6 is in the right subtree of 2 but is less than 7, violating BST rules.

---

### Example 3

**Input:**  
`root = [10, 5, 20, N, N, 9, 25]`

**Output:**  
`false`  

**Explanation:**  
Node with value 9 is in the right subtree of 10 but is less than 10, so not a valid BST.

---

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^9`

---

## Approach

- Use **recursive in-order validation** with **value bounds**.
- For each node:
  - Ensure node value is within `(min, max)` range.
  - Update bounds for left and right subtrees accordingly.

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

public class CheckBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
}