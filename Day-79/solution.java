
class Node79 {
    int data;
    Node79 left;
    Node79 right;
    Node79(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


class Diameter {
    
      private int maxDiameter = 0;
      
        // Your code here
        int diameter(Node79 root){
            height(root);
            return maxDiameter;
        }
        
        private int height(Node79 node){
            if(node == null) return 0;
            
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            
            int localDiameter = leftHeight +rightHeight;
            maxDiameter = Math.max(maxDiameter,localDiameter);
            
            return 1 + Math.max(leftHeight,rightHeight);
        }
    
}