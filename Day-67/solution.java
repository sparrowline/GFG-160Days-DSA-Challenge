/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class ReverseKGroup {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        
        if(head ==null || k<=1) return head;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;
        
        Node current = head;
        
        while(current != null){
            Node check = current;
            int count = 0;
            while(count<k && check != null){
                check = check.next;
                count++;
            }
            
            Node groupStart = current;
            Node prev = null;
            int reversed = 0;
            
            while(reversed <count){
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                reversed++;
            }
            
            prevGroupEnd.next = prev;
            groupStart.next = current;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
}