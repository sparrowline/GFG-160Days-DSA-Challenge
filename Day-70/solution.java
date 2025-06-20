class DetectLoop {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow by 1
            fast = fast.next.next;      // Move fast by 2

            if (slow == fast) {
                return true;            // Loop detected
            }
        }

        return false;                   // No loop
    }
}