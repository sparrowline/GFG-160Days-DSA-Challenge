# Add Two Numbers Represented by Linked Lists

---

## Problem Statement

You are given the **head nodes** of two singly linked lists, `num1` and `num2`. Each linked list represents a non-negative integer in **forward order** (most significant digit first). Your task is to compute the **sum of these two integers** and return the **head of the resulting linked list**, also in forward order.

**Note:**  
- Input lists may contain **leading zeros**, but the output list **must not** contain any leading zeros.
- Each node contains a **single digit (0–9)**.

---

## Examples

### Example 1

- **Input:**  
  `num1 = 1 -> 9 -> 0`  
  `num2 = 2 -> 5`  
- **Output:**  
  `2 -> 1 -> 5`  
- **Explanation:**  
  - Number1 = 190  
  - Number2 = 25  
  - Sum = 215, represented as `2 -> 1 -> 5`.

---

### Example 2

- **Input:**  
  `num1 = 4 -> 5`  
  `num2 = 3 -> 4 -> 5`  
- **Output:**  
  `3 -> 9 -> 0`  
- **Explanation:**  
  - Number1 = 45  
  - Number2 = 345  
  - Sum = 390

---

### Example 3

- **Input:**  
  `num1 = 0 -> 0 -> 6 -> 3`  
  `num2 = 0 -> 7`  
- **Output:**  
  `7 -> 0`  
- **Explanation:**  
  - Number1 = 63  
  - Number2 = 7  
  - Sum = 70

---

## Constraints

- `1 <= size of both linked lists <= 10^6`
- `0 <= node->data <= 9`

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
    
    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node addTwoNumbers(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        
        while (num1 != null || num2 != null || carry > 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        
        return reverse(dummy.next);
    }
}