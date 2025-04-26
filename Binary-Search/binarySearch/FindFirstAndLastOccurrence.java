package binarySearch;

public class FindFirstAndLastOccurrence {
	
	
	public static int[] findFirstAndLastOccurence(int nums[],int k) {
		int firstIndex=findOccurence(nums, k, true);
		int lastIndex=findOccurence(nums, k, false);
		
		return new int[] {firstIndex,lastIndex};
	}
	
	public static int findOccurence(int nums[], int k,boolean findFirst) {
		
		int start=0;
		int end=nums.length-1;
		int result=-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(nums[mid]==k) {
				result=mid;
				
				if(findFirst) {
					end=mid-1;
				}else {
					start=mid+1;
				}
				
			}else if(nums[mid]<k) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return result;
	}

}
