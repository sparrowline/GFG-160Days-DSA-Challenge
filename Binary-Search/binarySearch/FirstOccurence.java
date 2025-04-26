package binarySearch;

public class FirstOccurence {
	
	public static int findFirstOccurence(int [] nums,int k) {
		
		int start=0;
		int end=nums.length-1;
		int fOccurence=-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(nums[mid]==k) {
				fOccurence=mid;
				end=mid-1;
			}else if(nums[mid]>k) {
				end=mid-1;
			}else 
				start=mid+1;
		}
		return fOccurence;
	}

}
