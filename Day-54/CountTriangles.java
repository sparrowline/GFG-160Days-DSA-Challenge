import java.util.Arrays;

// User function Template for Java
class CountTriangles {
    static int countTriangles(int arr[]) {
        // code here
        //BF: TC(O^3) and SC (1);
    //     int n = arr.length;
    //     int count =0;
    //     for(int i = 0;i<n-2;i++){
    //         for(int j = i+1;j<n-1;j++){
    //             for(int k=j+1;k<n;k++){
    //                 int a = arr[i] ,b = arr[j], c = arr[k];
    //                 //sort the arrays to apply condition;
    //                 int[] side = {a,b,c};
    //                 Arrays.sort(side);
    //                 if(side[0]+side[1]>side[2]){
    //                     count++;
    //                 }
    //             }
    //         }
    //     }
    //     return count;
    // }
    //Using two pointer; TC: O(n^2) and sc(1);
    int n = arr.length;
    Arrays.sort(arr);
    int count = 0;
    
    for(int k=n-1;k>=0;k--){
        int i = 0;
        int j = k-1;
        while(i<j){
            if(arr[i]+arr[j]>arr[k]){
                count +=(j-i);
                j--;
            }else {
                i++;
            }
        }
    }
    
    return count;
    }
}