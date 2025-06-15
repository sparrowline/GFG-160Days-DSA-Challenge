# Left Rotate a Singly Linked List by K Positions

---

## Problem Statement

Given the head of a **singly linked list**, perform **k left rotations** on the list. A left rotation means moving the first node to the end of the list. The rotation should be done in-place.

---

## Examples

### Example 1

- **Input:**  
  `head = 10 -> 20 -> 30 -> 40 -> 50`, `k = 4`  
- **Output:**  
  `50 -> 10 -> 20 -> 30 -> 40`  
- **Explanation:**  
  Perform 4 left rotations:  
  1. `20 -> 30 -> 40 -> 50 -> 10`  
  2. `30 -> 40 -> 50 -> 10 -> 20`  
  3. `40 -> 50 -> 10 -> 20 -> 30`  
  4. `50 -> 10 -> 20 -> 30 -> 40`

---

### Example 2

- **Input:**  
  `head = 10 -> 20 -> 30 -> 40`, `k = 6`  
- **Output:**  
  `30 -> 40 -> 10 -> 20`  
- **Explanation:**  
  Since the length of the list is 4, `k = 6` is equivalent to `k % 4 = 2` rotations.

---

## Constraints

- `1 <= number of nodes <= 10^5`
- `0 <= k <= 10^9`
- `0 <= node.data <= 10^9`

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
    public Node rotateLeft(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Compute length of list
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Normalize k
        k = k % length;
        if (k == 0) return head;

        // Make the list circular
        temp.next = head;

        // Find the new tail: (length - k) steps from the head
        int stepsToNewHead = k;
        Node newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // Break the circle and set new head
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}