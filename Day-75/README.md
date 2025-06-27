# Level Order Traversal of Binary Tree

---

## Problem Statement

Given the root of a binary tree with `n` nodes, your task is to return the **level order traversal** of the tree.  
Level order traversal is a **breadth-first traversal**, where we visit all nodes at depth `d` before visiting the nodes at depth `d + 1`.

---

## Examples

### Example 1

**Input:**  
`root[] = [1, 2, 3]`

**Output:**  
`[[1], [2, 3]]`

---

### Example 2

**Input:**  
`root[] = [10, 20, 30, 40, 50]`

**Output:**  
`[[10], [20, 30], [40, 50]]`

---

### Example 3

**Input:**  
`root[] = [1, 3, 2, N, N, N, 4, 6, 5]`

**Output:**  
`[[1], [3, 2], [4], [6, 5]]`

---

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ node->data ≤ 10^9`

---

## Java Implementation

```java
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                currentLevel.add(curr.val);

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            result.add(currentLevel);
        }

        return result;
    }
}