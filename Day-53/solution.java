class CountPairsWithGiven {
///https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/pair-with-given-sum-in-a-sorted-array4940
    int countPairs(int arr[], int target) {
        // Complete the function
        int left = 0;
        int right = arr.length-1;
        int count=0;
        
        while(left<right){
            int sum = arr[left]+arr[right];
            
            if(sum==target){
                int leftVal = arr[left] ,rightVal = arr[right];
                int leftCount =0, rightCount=0;
                
                //count duplicates from left
                while(left<right && arr[left]==leftVal){
                    left++;
                    leftCount++;
                }
                
                //count duplicaes form rigth;
                while(right>=left && arr[right]==rightVal){
                    right--;
                    rightCount++;
                }
                
                if(leftVal == rightVal){
                    //all elements bw are same;
                    int total = leftCount+rightCount;
                    count+= (total *(total-1))/2;
                }else {
                    count +=leftCount*rightCount;
                }
                
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
