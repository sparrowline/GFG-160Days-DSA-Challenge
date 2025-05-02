class Sort012 {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        //quick sort will give tle here hence use dutch flag algo as it contains only 3 variables
        
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    //swap arr[low] and arr[mid];
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                    
                    case 1 :
                        mid++;
                        break;
                        
                    case 2 :
                        //swap arr[mid] and arr[high]
                        
                    int temp2 = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp2;
                        high--;
                        break;
            }
        }
        
     }
}