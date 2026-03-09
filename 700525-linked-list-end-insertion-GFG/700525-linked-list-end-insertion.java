/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        if(head == null){
            Node node = new Node(x);
            node.next = head;
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            Node node = new Node(x);
            temp.next = node;
        }
        
        return head;
        
    }
}