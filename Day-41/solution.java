class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] mat) {
        
        int row = mat.length;
        int cols = mat[0].length;
        
        boolean isFirstRowHasZeros = false;
        boolean isFirstColHasZeros = false;
        
        //1.check if first row has zeros;
        for(int i=0;i<cols;i++){
            if(mat[0][i]==0){
                isFirstRowHasZeros=true;
                break;
            }
        }
        
        //2.check if first col hass zeros;
        for(int i = 0 ; i<row ; i++){
            if(mat[i][0]==0){
                isFirstColHasZeros=true;
                break;
            }
        }
        
        //3.Use firstRow and col to mark zeros;
        for(int i = 1;i<row;i++){
            for(int j = 1;j<cols ;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        
        //4.Zeros out cells based on marker;
        for(int i = 1 ; i < row ;i++){
            for(int j = 1 ;j<cols ;j++){
                if(mat[i][0]==0 || mat[0][j]==0 ){
                    mat[i][j]=0;
                }
            }
        }
        
        //5. Zeros out first row if needed;
        
        if(isFirstRowHasZeros){
            for(int j = 0;j<cols;j++){
                mat[0][j]=0;
            }
        }
        
        //6 zeros out first cols if needed;
        
        if(isFirstColHasZeros){
            for(int i = 0;i<row;i++){
                mat[i][0]=0;
            }
        }
        
    }
}