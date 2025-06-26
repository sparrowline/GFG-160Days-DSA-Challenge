import java.util.ArrayList;

// User function Template for Java

class NQueen {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int [] board = new int[n];
        solve(0,board,result,n);
        return result;
    }
    
    private void solve(int col,int[] board,ArrayList<ArrayList<Integer>> result,int n){
        if(col==n){
            ArrayList<Integer> solution = new ArrayList<>();
             for(int i =0; i<n;i++){
                 solution.add(board[i]+1);
             }
             result.add(solution);
             return;
        }
        
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[col] = row;
                solve(col+1,board,result,n);
            }
        }
    }
    
    private boolean isSafe(int[] board,int row,int col,int n){
        for(int prevCol=0;prevCol<col;prevCol++){
            int prevRow = board[prevCol];
            //same row;
            if(prevRow == row) return false;
            //same diagonal
            if(Math.abs(prevRow-row) == Math.abs(prevCol-col)) return false;
            
        }
        return true;
    }
}