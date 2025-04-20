import java.util.Arrays;

class Minimize {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int maxDiff = arr[n - 1] - arr[0]; // initial max diff

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue; // heights can't be negative

            int minHeight = Math.min(smallest, arr[i] - k);
            int maxHeight = Math.max(largest, arr[i - 1] + k);

            maxDiff = Math.min(maxDiff, maxHeight - minHeight);
        }

        return maxDiff;
    }
}