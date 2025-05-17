class KthMissing {
    public int kthMissing(int[] arr, int k) {
        // code here
        // For any index i , the number missing positive integers before arr[i] is arr[i]-(i+1);
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            int missing = arr[mid]-(mid+1);
            
            if(missing<k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        
        return low+k;
    }
}