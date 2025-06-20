# Detect Loop in a Linked List

---

## Problem Statement

You are given the `head` of a **singly linked list**. Determine if the linked list contains a **loop (cycle)**.  
A loop exists if the `next` pointer of any node points to a previously visited node in the list.

---

## Custom Input Format

- A singly linked list.
- An integer `pos` (1-based index) indicating the position to which the last node points:
  - If `pos = 0`, the last node points to `null`, **no loop exists**.
  - If `pos > 0`, the last node points to the node at index `pos`, **a loop exists**.

---

## Examples

### Example 1

**Input:** `head: 1 -> 3 -> 4`, `pos = 2`  
**Output:** `true`  
**Explanation:** Last node connects back to node at position 2 (value 3). Loop detected.

---

### Example 2

**Input:** `head: 1 -> 8 -> 3 -> 4`, `pos = 0`  
**Output:** `false`  
**Explanation:** The last node points to `null`. No loop exists.

---

### Example 3

**Input:** `head: 1 -> 2 -> 3 -> 4`, `pos = 1`  
**Output:** `true`  
**Explanation:** Last node points back to the first node. Loop exists.

---

## Constraints

- `1 ≤ number of nodes ≤ 10^4`
- `1 ≤ node->data ≤ 10^3`
- `0 ≤ pos ≤ number of nodes`

---

## Java Implementation

```java
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    public static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If they meet, loop exists
            if (slow == fast) return true;
        }

        return false;
    }
}