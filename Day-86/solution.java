class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Find the intersection point of two runners
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
}