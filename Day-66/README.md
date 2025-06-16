# Merge Two Sorted Linked Lists

---

## Problem Statement

Given the heads of **two sorted singly linked lists**, merge them into a single sorted linked list. Return the head of the merged list. The resulting list should also be sorted in **non-decreasing order**.

---

## Examples

### Example 1

- **Input:**  
  `head1 = 5 -> 10 -> 15 -> 40`  
  `head2 = 2 -> 3 -> 20`  
- **Output:**  
  `2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40`  
- **Explanation:**  
  Both lists are merged in a way that maintains ascending order.

---

### Example 2

- **Input:**  
  `head1 = 1 -> 1`  
  `head2 = 2 -> 4`  
- **Output:**  
  `1 -> 1 -> 2 -> 4`  
- **Explanation:**  
  Duplicates are preserved, and overall order remains sorted.

---

## Constraints

- `1 <= number of nodes <= 10^3`
- `0 <= node.data <= 10^5`

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
    public Node mergeTwoLists(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes
        if (head1 != null) tail.next = head1;
        if (head2 != null) tail.next = head2;

        return dummy.next;
    }
}