# Remove Loop in a Linked List

---

## Problem Statement

Given the `head` of a **singly linked list**, determine if a **loop** is present and **remove it** if found.

A **loop** exists when a node’s `next` pointer points back to a previously visited node, forming a cycle. The task is to **detect and remove** this loop while keeping the rest of the list intact.

---

## Custom Input Format

- A singly linked list.
- A `pos` (1-based index) indicating the node the last node connects to:
  - `pos = 0`: No loop exists (last node points to null).
  - `pos > 0`: Last node points to the node at the given position (loop exists).

---

## Output

Return `true` if after the function call:
- The list has **no loop**, and
- The structure of remaining nodes is **unchanged**.

Return `false` otherwise.

---

## Examples

### Example 1

**Input:**  
`head = 1 -> 3 -> 4`, `pos = 2`  
**Output:** `true`  
**Explanation:** A loop exists at position 2 (value 3). Loop removed successfully.

---

### Example 2

**Input:**  
`head = 1 -> 8 -> 3 -> 4`, `pos = 0`  
**Output:** `true`  
**Explanation:** No loop exists. Structure remains unchanged.

---

### Example 3

**Input:**  
`head = 1 -> 2 -> 3 -> 4`, `pos = 1`  
**Output:** `true`  
**Explanation:** Loop at position 1 (value 1). Loop removed.

---

## Constraints

- `1 ≤ size of linked list ≤ 10^5`

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
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop using Floyd's cycle detection
        boolean hasLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        // Step 2: If loop exists, remove it
        if (hasLoop) {
            slow = head;
            // Special case: loop starts at head
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            // Remove loop
            fast.next = null;
        }
    }
}