import java.util.ArrayList;
import java.util.Stack;

class CalculateSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> stack = new Stack();
        
        for(int i =0;  i<n;i++){
            
            while(!stack.isEmpty() && arr[stack.peek()] <=arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                span.add(i+1);
            }else{
                span.add(i-stack.peek());
            }
            stack.push(i);
        }
        return span;
    }
}