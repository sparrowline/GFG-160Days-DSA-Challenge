import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class NextLargerElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        int n = arr.length;
        
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> stack = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek() <=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.set(i,stack.peek());
            }
            
            stack.push(arr[i]);
        }
        
        return result;
    }
}