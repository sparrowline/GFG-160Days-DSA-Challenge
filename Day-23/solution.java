import java.util.ArrayList;
import java.util.List;

class InversionCount {
    // Function to count inversions in the array.
     static int count;
    static int inversionCount(int arr[]) {
        // Your Code Here
            count=0;
            mergeSort(arr,0,arr.length-1);
            return count;
        
            }
            
            private static void mergeSort(int arr[], int low,int high){
                if(low>=high) return ;
                
                int mid = (low+high)/2;
                
                mergeSort(arr,low,mid); //left half;
                mergeSort(arr,mid+1,high); //right harlf;
                
                merge(arr,low,mid,high); //merging sorted halfs;
                
            }
            
            private static void merge(int arr[], int low, int mid, int high){
                
                //create a temp array to store sorted element;
                List<Integer> al = new ArrayList<>();
                
                //define pointers
                int left = low;
                int right = mid+1;
                
                while(left<=mid && right <=high){
                    
                    if(arr[left]<=arr[right]){
                        al.add(arr[left]);
                        left++;
                    }else{
                        al.add(arr[right]);
                        right++;
                        //all elements from left to mid are greater than arr[right];
                        count += (mid - left+1);
                    }
                }
                
            //if elements on right half are still there;
            while(right<=high){
                al.add(arr[right]);
                right++;
            }
            
            //if elements on right half are still there;
             while(left<=mid){
                al.add(arr[left]);
                left++;
             }
             
             //transfer all elements from sorted array;
             
             for(int i=low;i<=high;i++){
                 arr[i]=al.get(i-low);
             }
        }
    }
