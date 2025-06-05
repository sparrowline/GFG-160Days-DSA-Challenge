import java.util.ArrayList;
import java.util.Arrays;

class SubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
       int n = arr.length;
       int start = 0,end = 0,sum = 0;
       
       while(end<n){
           sum +=arr[end];
           
           while(sum>target && start < end){
               sum-=arr[start];
               start++;
               
           }
           
           if(sum==target){
               return new ArrayList<>(Arrays.asList(start+1,end+1));
           }
           
           end++;
       }
       return new ArrayList<>(Arrays.asList(-1));
    }
}
