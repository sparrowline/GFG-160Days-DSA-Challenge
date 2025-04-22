package binarySearch;

public class MinDifferenceElementInSortedArray {
	
	public static void main(String[] args) {
        int[] nums = {1, 3, 8, 10, 15};
        int key = 12;

        System.out.println("Minimum difference is: " + findMinDiff(nums, key)); 
        // Output: 2 (because 12 - 10 = 2)
    }

	private static int findMinDiff(int nums[], int key) {

		int start = 0;
		int end = nums.length - 1;
		

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] == key) {
				return nums[mid];
			} else if (key < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		int diff1 = (start < nums.length) ? Math.abs(nums[start] - key) : Integer.MAX_VALUE;
		int diff2 = (end >= 0) ? Math.abs(nums[end] - key) : Integer.MAX_VALUE;

		return Math.min(diff1, diff2);

	}

}
