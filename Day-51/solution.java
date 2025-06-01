import java.util.Arrays;

class CountPairslessThank {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int left =0;
        int right=n-1;
        int count=0;
        while(left<right){
            if(arr[left]+arr[right]<target){
                    count += (right-left);
                    left++;
                }else{
                    right--;
                }
        }
        return count;
    }
}