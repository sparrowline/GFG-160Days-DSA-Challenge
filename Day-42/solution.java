import java.util.Arrays;
import java.util.HashSet;

class TwoSum {
    boolean twoSum(int arr[], int target) {
        // code here
        // Arrays.sort(arr);
        // int i =0;
        // int j =arr.length-1;
        //     while(i<j){
        //         if(arr[i]+arr[j]==target){
        //             return true;
        //         }else if(arr[i]+arr[j]<target){
        //             i++;
        //         }else{
        //             j--;
        //         }
        //     }
        
        // return false;
        
        HashSet<Integer> set = new HashSet();
        
        for(int num : arr){
            int compliment = target-num;
            if(set.contains(compliment)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
    
}