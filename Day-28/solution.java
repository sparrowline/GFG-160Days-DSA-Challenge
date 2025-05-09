class CountFreq {
    int countFreq(int[] arr, int target) {
        // code here
    	// This will give TC of linear time O(n);
        // int n = arr.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==target){
        //         count++;
        //     }
        // }
        // return count;
        
        //Using Binary Search for O(log n) TC;
        int first = findFirst(arr,target);
        if(first==-1) return 0;
        int last = findLast(arr,target);
        return last-first+1;
    }
    
    private static int findFirst(int arr[],int target){
        int low =0;
        int high= arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }else if(arr[mid]<target){ //when target lies in right side;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
    
    private static int findLast(int arr[],int target){
        int low =0;
        int high= arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                low=mid+1; //keep lookin on right for last occurence;
            }else if(arr[mid]<target){ //when target lies in right side;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
}
