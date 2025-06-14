# Reverse a Singly Linked List

---

## Problem Statement

Given the head of a **singly linked list**, reverse the list in-place and return the new head.

The list must be reversed such that:
- The previous tail becomes the new head.
- Each node’s `next` pointer is reversed to point to the previous node.

---

## Examples

### Example 1
- **Input:**  
  `head = 1 -> 2 -> 3 -> 4 -> NULL`  
- **Output:**  
  `head = 4 -> 3 -> 2 -> 1 -> NULL`  
- **Explanation:**  
  List is reversed by adjusting the `next` pointers of each node.

---

### Example 2
- **Input:**  
  `head = 2 -> 7 -> 10 -> 9 -> 8 -> NULL`  
- **Output:**  
  `head = 8 -> 9 -> 10 -> 7 -> 2 -> NULL`

---

### Example 3
- **Input:**  
  `head = 2 -> NULL`  
- **Output:**  
  `2 -> NULL`  
- **Explanation:**  
  Single-node list remains unchanged after reversal.

---

## Constraints

- `1 <= number of nodes <= 10^5`
- `1 <= node.data <= 10^5`
- Must be done using **O(1)** extra space (in-place)

---

## Java Implementation

```java
class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class Solution {
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;     // Store next node
            current.next = prev;     // Reverse current node's pointer
            prev = current;          // Move prev one step ahead
            current = next;          // Move current one step ahead
        }

        return prev;  // New head
    }
}