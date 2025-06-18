/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/
class RemoveLeadingZeros {
    
     private static Node reverse(Node head){
        Node prev = null, current = head;
        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    private static Node removeLeadingZeros(Node head){
        while(head != null && head.data == 0 && head.next!= null){
            head = head.next;
        }
        return head;
    }
    
    static Node addTwoLists(Node num1,Node num2){
         // code here
        num1 = reverse(num1);
        num2 = reverse(num2);
        
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        int carry = 0;
        
        
        while(num1 != null || num2 != null || carry != 0){
            int sum = carry;
            
            if(num1 != null){
                sum +=num1.data;
                num1 = num1.next;
            }
            
            if(num2 != null){
                sum +=num2.data;
                num2 = num2.next;
            }
            
            carry = sum/10;
            temp.next = new Node(sum %10);
            temp = temp.next;
            
        }
        
        Node result = reverse(dummy.next);
        return removeLeadingZeros(result);
    }
}