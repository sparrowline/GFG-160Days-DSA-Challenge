// User function Template for Java

class MaxWater1 {

    public int maxWater(int arr[]) {
        // Code Here
        int maxArea = 0;
        int left = 0;
        int right = arr.length-1;
        
        while(left <right){
            
            int height = Math.min(arr[left],arr[right]);
            int width = right-left;
            int area = height * width;
            
            maxArea = Math.max(maxArea, area);
            
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}