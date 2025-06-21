class RemoveLoop {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;
        boolean loopExists = false;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        // Step 2: If loop exists
        if (loopExists) {
            slow = head;

            // Special case: If loop starts at head
            if (slow == fast) {
                // Find the last node in the loop
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                // Move both pointers until their nexts are equal
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            // Step 3: Break the loop
            fast.next = null;
        }
    }
}