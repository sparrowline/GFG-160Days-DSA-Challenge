import java.util.ArrayList;

class SpirallyTraverse {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        
        while(top<=bottom && left<=right){
            
            //travers top row left to right;
            for(int i=left;i<=right;i++){
                result.add(mat[top][i]);
            }
            top++;
            
            // traverse right coloumn top to bottom;
            for(int i=top;i<=bottom;i++){
                result.add(mat[i][right]);
            }
            right--;
            
            // Traverse bottom row from right to left if still in bounds;
            if(top<=bottom){
                for(int i= right;i>=left;i--){
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            //Traverse left coloumn (bottom to top ) is still within bounds;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
