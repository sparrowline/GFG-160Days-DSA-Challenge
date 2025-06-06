import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CountDistinct {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> freqMap = new HashMap();
        
        for(int i = 0;i<k;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        result.add(freqMap.size());
        
        for(int i=k;i<arr.length;i++){
            int out = arr[i-k];
            freqMap.put(out,freqMap.get(out)-1);
            if(freqMap.get(out)==0){
                freqMap.remove(out);
            }
            
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
            
            result.add(freqMap.size());
            
        }
        
        return result;
    }
}