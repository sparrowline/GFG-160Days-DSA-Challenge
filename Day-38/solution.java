class MatSearch {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int m = mat.length;         //number of rown;
        int n = mat[0].length;      //number of columns;
        
        int i = 0;
        int j = n-1;                //start from top right corener
        //caryout the condition till it reaches outof bound 
        while(i<m && j>=0){
            if(mat[i][j] == x){
                return true;// found the element;
            }else if(mat[i][j]>x){
                j--;        //move left
            }else if(mat[i][j]<x){
                i++;        //move down ;
            }
        }
        
        return false;
        
    }
}