package binarySearch;

public class PeakElementInSortedArray {

	private static int findPeakElement(int nums[]) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid > 0 && mid < nums.length - 1) {
				if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
					return nums[mid];
				}
				// move which side portion is greater than the mid element;
				else if (nums[mid - 1] > nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
				// cheecking edge cases for start element to compare one side only
			} else if (mid == 0) {
				if(nums[0]>nums[1]) {
					return nums[0];
				}else {
				return 1;
			}
			}else if (mid == nums.length - 1) {
					if(nums[nums.length-1]>nums[nums.length-2]) {
						return nums.length-1;
					}else 
						return nums.length-2;
			}

		}
		return -1;
	}
	
	
}
