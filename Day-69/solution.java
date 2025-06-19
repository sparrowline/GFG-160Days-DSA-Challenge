class FindFirstNodeion {
    public static Node findFirstNode(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                // Step 2: Find the starting node of loop
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;  // This is the first node of the loop
            }
        }

        return null; // No loop
    }
}