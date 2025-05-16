class Rotateby90 {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n = mat.length;
        
        for(int i = 0;i<n ;i++){
            for(int j= i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        
        for(int col = 0; col<n ;col++){
            int top = 0;
            int bottom = n-1;
            
            while(top<bottom){
                int temp = mat[top][col];
                mat[top][col] = mat[bottom][col];
                mat[bottom][col] = temp;
                top++;
                bottom--;
            }
            
        }
    }
}