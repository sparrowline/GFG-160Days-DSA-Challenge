import java.util.Arrays;

class AggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here //k = cows;
        Arrays.sort(stalls);
        
        int low = 0;
        int high = stalls[stalls.length-1]-stalls[0];
        int res = 0;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canPlaceCows(stalls,k,mid)){
                res = mid;
                low = mid+1; //try for bigger min distance;
            }else{
                high = mid-1; //try for possiible distance;
            }
        }
            return res;
    }
    
    //dist == mid element from bs;
    private static boolean canPlaceCows(int arr[],int cows , int dist){
         int position = arr[0];
         int count = 1;
         
         for(int i= 1 ;i<arr.length ;i++){
             if(arr[i]-position >=dist ){
                 count++;
                 position = arr[i];
             }
             if(count==cows) return true;
         }
         return false;
    }
}