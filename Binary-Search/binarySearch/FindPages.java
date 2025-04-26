package binarySearch;

public class FindPages {
public static int findPages(int[] arr, int k) {
        
        if(arr.length<k) return -1; //not enough books for students;
        
        int sum=0;
        
         for(int num : arr){
             sum +=num;
         }
         
         int max = 0;
         
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         
         
         
        int start = max;
        int end = sum;
        int result = -1;
        
        while(start<=end){
            
            int mid = start+(end-start)/2;
            
            if(isValid(arr,k,mid)){
                result = mid;//possible pages that can be allocated;
                end = mid -1;
            }else {
                start = mid+1;
            }
            
        }
        return result;
    }
    
    private static boolean isValid(int arr[], int k,int maxPages){
        int student =1;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            if(sum>maxPages){
                student++;
                sum = arr[i];
            }
            if(student >k){
                return false;
            }
        }
        return true;
    }

}
