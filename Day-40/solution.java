class SearchMatrix {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0;
        int high = n*m-1;
        
        while(low <= high ){
            int mid = low+(high-low)/2;
            
            int row = mid/m;
            int col = mid%m;
            
            if(mat[row][col]==x){
                return true;
            }else if(mat[row][col]<x){
                 low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
