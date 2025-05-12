class PeakElement {

    public int peakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0; // Only one element is trivially a peak

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check boundaries explicitly
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;
                else if (arr[mid - 1] > arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (mid == 0) {
                return arr[0] > arr[1] ? 0 : 1;
            } else if (mid == n - 1) {
                return arr[n - 1] > arr[n - 2] ? n - 1 : n - 2;
            }
        }
        return -1; // No peak found (theoretically unreachable)
    }
}