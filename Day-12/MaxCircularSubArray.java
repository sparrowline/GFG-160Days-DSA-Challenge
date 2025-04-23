public class MaxCircularSubArray {

	// a: input array
	// n: size of array
	// Function to find maximum circular subarray sum.
	public int circularSubarraySum(int arr[]) {

		int totalSum = 0;
		int currentMax = arr[0];
		int currentMin = arr[0];
		int maxKadan = arr[0];
		int minKadan = arr[0];

		for (int i = 1; i < arr.length; i++) {

			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxKadan = Math.max(maxKadan, currentMax);

			currentMin = Math.min(arr[i], currentMin + arr[i]);
			minKadan = Math.min(minKadan, currentMin);

			totalSum += arr[i];
		}
		// add index 0 element as we started it from 1
		totalSum += arr[0];

		if (maxKadan < 0)
			return maxKadan;

		return Math.max(maxKadan, totalSum - minKadan);
	}
}
