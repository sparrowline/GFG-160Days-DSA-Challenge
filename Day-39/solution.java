class SearchRowMatrix {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length; // no of rows;
        int m = mat[0].length; // no of columns;
        
        for(int i = 0 ; i<n;i++){
            
            int low = 0;
            int high = m-1;
            
            while(low<=high){
                int mid = low+(high-low)/2;
                
                if(mat[i][mid]==x){
                    return true;
                }else if(mat[i][mid]<x){
                    low =mid+1;
                }else {
                    high = mid-1;
                }
                
            }
        }
        return false;
    }
}
