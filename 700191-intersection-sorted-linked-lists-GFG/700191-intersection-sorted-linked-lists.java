/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(0);
        Node tail = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.data == temp2.data){
                tail.next = new Node(temp1.data);
                tail = tail.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.data<temp2.data){
                temp1 = temp1.next;
            }
            else{
                temp2 = temp2.next;
            }
        }
        return dummy.next;
    }
}