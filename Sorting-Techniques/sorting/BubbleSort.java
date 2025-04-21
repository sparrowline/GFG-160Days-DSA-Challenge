package sorting;

public class BubbleSort {

	private static void bubbleSort(int[] num, int n) {
		boolean swapped;

		for (int i = n - 1; i >= 1; i--) {
			swapped = false;

			for (int j = 0; j < i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) break; // Optimization: stop if already sorted
		}

		System.out.println("After Bubble Sort:");
		printArray(num);
	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] num = { 13, 46, 24, 52, 20, 9 };
		int n = num.length;

		System.out.println("Before Bubble Sort:");
		printArray(num);

		bubbleSort(num, n);
	}

}
