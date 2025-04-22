package sorting;

public class SelectionSort {

	private static void selectionSort(int arr[],int n) {
		
		for(int i=0;i<n-1;i++) {
			//considering first element as min ;
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				//comparing min positin element with second position and so on.. till min is found;
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			//swap smallest element with respective position element;
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
	
	public static void main(String args[]) {

        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort(arr, n);
    }
}
