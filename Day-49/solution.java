import java.util.HashMap;

class CountSubarrays {
    public int countSubarrays(int arr[], int k) {
        // code here
        //BF will give TL;
    //      int n = arr.length;
    //      int count = 0;
         
    //      for(int i = 0;i < n ; i++){
    //          int sum = 0;
    //          for(int j = i;j <n ;j++){
    //              sum +=arr[j];
    //              if(sum==k){
    //                  count++;
    //              }
    //          }
    //      }
    //      return count;
    
    
    //----------------> Optimized One Using PrefixSum and HashMap;
        
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //base case Sum 0 with 1 freq,
        
        for(int num : arr){
            
            prefixSum = prefixSum+num; //update prefixSum;
            //check if prefixSum-k present in hash map if true then increament;
            if(map.containsKey(prefixSum-k)){
                count = count+map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}