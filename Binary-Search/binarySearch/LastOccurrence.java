package binarySearch;


public class LastOccurrence {
	//in a Ascending sorted array;
	public static int lastIndex(int[] nums,int k) {
		int start=0;
		int end=nums.length-1;
		int result=-1;
		
		while(start<=end) {
			
			int mid= start+(end-start)/2;
			
			if(nums[mid]==k) {
				result=mid;
				start=mid+1;
			}else if(nums[mid]<k) {
				start=mid+1;
			} else {
				end=mid-1;
			}
		}
		return result;
	}

}
