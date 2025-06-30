# Inorder Traversal of a Binary Tree

---

## Problem Statement

Given a **binary tree**, your task is to return its **in-order traversal**.

> In-order traversal sequence:  
> **Left Subtree ➝ Node ➝ Right Subtree**

---

## Follow-Up

Can you implement it using **O(1) auxiliary space**?  
*(Hint: Morris Traversal)*

---

## Examples

### Example 1

**Input:**  
`root[] = [1, 2, 3, 4, 5]`

**Output:**  
`[4, 2, 5, 1, 3]`

**Explanation:**  
The in-order traversal visits nodes in the sequence:  
Left subtree of 1 → node 2 → left 4, right 5 → then root 1 → then right 3.

---

### Example 2

**Input:**  
`root[] = [8, 1, 5, N, 7, 10, 6, N, 10, 6]`

**Output:**  
`[1, 7, 10, 8, 6, 10, 5, 6]`

**Explanation:**  
Follows the in-order traversal rule across all subtrees and nodes.

---

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ node->data ≤ 10^5`

---

## Java Implementation

### Recursive Approach

```java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}