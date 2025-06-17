# Reverse Every K Nodes in a Linked List

---

## Problem Statement

Given the **head of a singly linked list**, reverse the nodes of the list in **groups of size `k`**. If the number of nodes remaining at the end is **less than `k`**, treat them as a group and reverse as well.

Return the head of the modified list after all the group reversals.

---

## Examples

### Example 1

- **Input:**  
  `head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8`, `k = 4`
- **Output:**  
  `4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5`
- **Explanation:**  
  - Group 1: `1 -> 2 -> 2 -> 4` becomes `4 -> 2 -> 2 -> 1`  
  - Group 2: `5 -> 6 -> 7 -> 8` becomes `8 -> 7 -> 6 -> 5`  
  Final list: `4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5`

---

### Example 2

- **Input:**  
  `head = 1 -> 2 -> 3 -> 4 -> 5`, `k = 3`
- **Output:**  
  `3 -> 2 -> 1 -> 5 -> 4`
- **Explanation:**  
  - Group 1: `1 -> 2 -> 3` becomes `3 -> 2 -> 1`  
  - Group 2: `4 -> 5` becomes `5 -> 4`  
  Final list: `3 -> 2 -> 1 -> 5 -> 4`

---

## Constraints

- `1 <= size of linked list <= 10^5`
- `1 <= data of nodes <= 10^6`
- `1 <= k <= size of linked list`

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
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (true) {
            Node kth = getKthNode(prevGroupEnd, k);
            if (kth == null) break;

            Node groupStart = prevGroupEnd.next;
            Node nextGroupStart = kth.next;

            // Reverse the group
            Node prev = kth.next;
            Node current = groupStart;
            while (current != nextGroupStart) {
                Node temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }

            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    private Node getKthNode(Node current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }
}