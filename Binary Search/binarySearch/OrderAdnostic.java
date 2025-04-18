package binarySearch;

public class OrderAdnostic {
	
	
	public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {9, 7, 5, 3, 1};

        System.out.println(findElement(arr1, 5)); // Output: 2
        System.out.println(findElement(arr2, 5)); // Output: 2
        System.out.println(findElement(arr2, 10)); // Output: -1
    }
	public static int findElement(int []nums,int k) {
		
		int start=0;
		int end=nums.length-1;
		boolean isAscending=nums[0]<nums[end];
		
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]==k) {
				return mid;
			}
			if(isAscending) {
				 if(nums[mid]>k) {
					end=mid-1;
				}else if(nums[mid]<k) {
					start=mid+1;
				}
			} else {
				if(nums[mid]<k) {
					end=mid-1;
				}else if(nums[mid]>k) {
					start=mid+1;
				}
			}
			
		}
		return -1;
	}

}
