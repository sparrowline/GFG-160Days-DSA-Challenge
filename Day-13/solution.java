class SmallestPositiveMissing {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!= arr[i]){
                
                int correctId = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[correctId];
                arr[correctId] = temp;
                
            }
        }
        
        //find the first index where value is not 1;
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}