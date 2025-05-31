import java.util.HashMap;

class SubarrayXor {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixXor = 0;
        long count = 0;
        
        for(int num : arr){
            prefixXor ^= num;
            
            if(prefixXor == k){
                count++;
            }
            
            int requird = prefixXor ^k;
            if(map.containsKey(requird)){
                count += map.get(requird);
            }
            
            map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
        }
        return count;
    }
}