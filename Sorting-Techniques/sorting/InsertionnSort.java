package sorting;

//inserting elements based on its appropriate position.
public class InsertionnSort {

	private static void insertionSort(int arr[], int n) {

		for (int i = 0; i < n; i++) {

			int j = i;

			while (j > 0 && arr[j - 1] > arr[j]) {

				// swap elements

				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;

				j--;
			}
		}

		System.out.println("After Insertion Sort");
		printArray(arr);

	}

	private static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}

	public static void main(String[] args) {

		int[] num = { 13, 46, 24, 52, 20, 9 };
		int n = num.length;

		System.out.println("Before Insertion Sort");
		printArray(num);

		insertionSort(num, n);
	}

}
