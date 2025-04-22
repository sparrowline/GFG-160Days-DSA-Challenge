package sorting;

import java.util.ArrayList;

public class MergeSort {

	void mergeSort(int arr[], int low, int high) {
		int mid = (low + high) / 2;

		if (low >= high)
			return;
		mergeSort(arr, low, mid); // left half array;
		mergeSort(arr, mid + 1, high); // right half array;
		merge(arr, low, mid, high);
	}

	private static void merge(int arr[], int low, int mid, int high) {

		// create temp array to store the elements in sorted order;

		ArrayList<Integer> al = new ArrayList<>();

		// define the pointers (start positions of two sub arrays)
		int left = low;
		int right = mid + 1;

		// iterate till either of the arrays are empty
		while (left <= mid && right <= high) {

			// for merging the array compare the two elements of array;
			if (arr[left] <= arr[right]) {
				al.add(arr[left]);
				// move the pointer to next element;
				left++;
			} else {
				al.add(arr[right]);
				right++;
			}
		}

		// check if right array is still emtyp to add in the temp array;

		while (left <= mid) {

			al.add(arr[left]);
			left++;
		}

		// check if right array is still empty to add in the temp array;

		while (right <= high) {
			al.add(arr[right]);
			right++;
		}

		// add the sorted temp array elements to Original array;

		for (int i = low; i <= high; i++) {
			arr[i] = al.get(i - low);
		}

	}
}
