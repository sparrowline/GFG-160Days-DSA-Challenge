class MergeArraystion {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        
        int n = a.length;
        int m = b.length;
        
        int max = Math.max(n,m);
        
       
        for(int i =0;i<n;i++){
            
            if(a[i]>b[0]){
                //swap them 
                int temp =a[i];
                a[i]=b[0];
                b[0] = temp;
                
                int first = b[0];
                int k;
                
                for(k=1;k<m && b[k] < first ;k++){
                    b[k-1] = b[k];
                }
                b[k-1] =first;
                
            } 
        }
        
    }
}
