import java.util.Arrays;

class MinRemoval {
    static int minRemoval(int intervals[][]) {
        // code here
        
        //Sort the intervals by end time;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        
        int count = 0; //count for non overlapping intervals;
        int end = Integer.MIN_VALUE;
        
        for(int[] interval :intervals){
            if(interval[0]>=end){
                //no overlap hence include it;
                end = interval[1];
                count++;
            }
        }
        
        return intervals.length-count;
        
    }
}
