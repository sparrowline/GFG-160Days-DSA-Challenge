# Detect the First Node of a Loop in a Singly Linked List

---

## Problem Statement

You are given the `head` of a **singly linked list**. If there exists a **loop**, return the **first node** (1-based index) where the loop starts. If no loop exists, return `-1`.

---

## Custom Input Format

- A singly linked list ending in a cycle or NULL.
- A value `pos` (1-based index) indicating the node the last node connects to.
  - If `pos = 0`, there is **no loop**.
  - If `pos > 0`, the last node points to the node at `pos`, forming a **loop**.

---

## Examples

### Example 1

**Input:**  
A linked list where the last node connects to the 3rd node.

**Output:**  
`3`  
**Explanation:**  
A loop is detected starting at node with value 3.

---

### Example 2

**Input:**  
A linked list with `pos = 0` (no loop).

**Output:**  
`-1`  
**Explanation:**  
There is no cycle, so the result is `-1`.

---

## Constraints

- `1 <= number of nodes <= 10^6`
- `1 <= node->data <= 10^6`

---

## Java Implementation

```java
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
}

class Solution {

    public static Node detectLoopStart(Node head) {
        Node slow = head, fast = head;

        // Detect if loop exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected, now find entry point
                Node entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // Start of the loop
            }
        }
        return null; // No loop
    }

    public static int findFirstLoopNode(Node head) {
        Node loopStart = detectLoopStart(head);
        return loopStart != null ? loopStart.data : -1;
    }
}