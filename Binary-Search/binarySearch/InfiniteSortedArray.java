package binarySearch;

public class InfiniteSortedArray {
	

	public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39};
        int k = 18;
        int result = findK(arr, k);
        
        System.out.println("Index of " + k + " is: " + result);
	}
	
	private static int findK(int nums[],int k) {
		int start =0;
		int end = 1;
		
		while(end<nums.length && nums[end]<k ) {
			start = end;
			end = end  * 2 ; 
			
		}
		
		return binarySearch(nums,k,start,end);	
		
	}
	
	private static int binarySearch(int nums[],int k,int start,int end ) {
		
		
		
		while(start <= end) {
			
			int mid = start+(end-start)/2;
			if(k==nums[mid]) {
				return mid;
			}else if(k<nums[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
			return -1; //if not found;
	}

}
