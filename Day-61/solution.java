import java.util.HashMap;

// User function Template for Java

class longestSubarray {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int maxLen =0;
        
        for(int i = 0;i<arr.length;i++){
            currentSum +=arr[i];
            
            if(currentSum == k){
                maxLen = i+1;
            }
            
            if(map.containsKey(currentSum-k)){
                int len = i-map.get(currentSum-k);
                maxLen = Math.max(maxLen,len);
            }
            
            if(!map.containsKey(currentSum)){
                map.put(currentSum,i);
            }
        }
        return maxLen;
    }
}
