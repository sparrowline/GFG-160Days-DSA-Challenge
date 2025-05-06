import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeOverlap {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        List<int []> result = new ArrayList<>();
        
        if(arr==null || arr.length==0 ) return result;
        
        
        //Step 1 Sort the array by Start time;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        
        //step 2 : Merge the intervels:
        int current[] = arr[0];
        result.add(current);
        
        for(int i = 1; i<arr.length;i++){
            int next[] = arr[i];
            
            if(next[0] <=current[1]){
                //Overlap: merge intervals
                current[1] = Math.max(current[1],next[1]);
            }else{
                //No overlap move to the next;
                current = next;
                result.add(current);
            }
        }
        return result;
    }
}