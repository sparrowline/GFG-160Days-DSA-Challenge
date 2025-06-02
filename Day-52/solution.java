import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// User function Template for Java

class SumClosest {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n = arr.length;
        List<Integer> result = new  ArrayList<>();
        
        if(n<2) return result;
        Arrays.sort(arr);
        
        int left = 0;
        int right= n-1;
        int clossestDiff = Integer.MAX_VALUE;
        int maxAbsDiff = -1;
        
        while(left<right){
                int a = arr[left];
                int b = arr[right];
                int sum = a+b;
                int diff = Math.abs(sum-target);
                int absDiff = Math.abs(a-b);
                
                if(diff<clossestDiff ||(diff==clossestDiff && absDiff>maxAbsDiff)){
                    clossestDiff = diff;
                    maxAbsDiff = absDiff;
                    result = Arrays.asList(a,b);
                }
                if(sum<target){
                    left++;
                } else {
                    right--;
                }
        }
        return result;
    }
}