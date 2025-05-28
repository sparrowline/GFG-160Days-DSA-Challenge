import java.util.HashSet;
//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/longest-consecutive-subsequence2449
class LongestConsecutive {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // Brute force with O(nlogn) TC and O(1) SC;
//         Arrays.sort(arr);
//             int currentLength = 1;
//             int maxLength =1;
//         for(int i =1; i<arr.length;i++){
//             if(arr[i]==arr[i-1]) continue; //to avoid duplicate element increamenet;
//             if(arr[i]==arr[i-1]+1){
//                 currentLength++;
//             }else {
//                 currentLength=1; //else reset the streak;
//             }
//             maxLength = Math.max(currentLength,maxLength);
//         }
//         return maxLength;
//     }
        
// }  
    //--------------------------
//         //Optimized Version with O(n) TC and O(n) SC;
        HashSet<Integer> set = new HashSet();
        //1: add elements to hash becouse it give O(1) lookup;
        for(int num : arr){
            set.add(num);
        }
        
        //1: check if num =num-1
        int maxLength = 0;
        
        for(int num : arr){
            if(!set.contains(num-1)){
                int current = num;
                int streak = 1;
                while(set.contains(current+1)){
                    streak++;
                    current++;
                }
                maxLength = Math.max(maxLength,streak);
            }
        }
        return maxLength;
    }
}