package binarySearch;

public class SearchInMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;     //number of rows ;
        int column = matrix[0].length;  // number of columns;

        int i = 0;  //current index of row;
        int j = column-1; //currnt index of column;

        while(i< row && j>=0){
            
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                i++;
            }else if(matrix[i][j]>target){
                j--;
            }
        }
        return false;
    }
}
