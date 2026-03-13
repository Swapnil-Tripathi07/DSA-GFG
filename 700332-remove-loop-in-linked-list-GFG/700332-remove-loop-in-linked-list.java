/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while(temp!=null && temp.next!=null){
            if(set.contains(temp.next)){
                temp.next = null;
            }
            set.add(temp);
            temp = temp.next;
        }
        
    }
}