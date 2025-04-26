package binarySearch;

public class FindOneInBinarySortedArray {
	
	public static void main(String[] args) {
		
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        int k = 1;
        int result = findOne(arr);
        
        System.out.println("Index of " + k + " is: " + result);
	}
	
	private static int findOne(int nums[]) {
		int start = 0;
		int end = 1;
		
		while(end<nums.length && nums[end]<1) {
			start = end;
			end = end*2;
					
		}
		
		return binarySearch(nums,start,end);
	}

	private static int binarySearch(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int firstOccurence=-1;
		
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(nums[mid]==1) {
				
				firstOccurence=mid;
				end=mid-1;
			}else if(nums[mid]>1) {
				end = mid-1;
				
			}else {
				start = mid+1;
				
			}
			
		}
		return firstOccurence;
	}

}
