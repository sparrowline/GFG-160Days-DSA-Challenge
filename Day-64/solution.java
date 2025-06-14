// function Template for Java

//linked list node class:

class Node {
    int data;
    Node next;
	private int value;
    Node(int value) {
        this.value = value;
    }
}



class ReverseList {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}