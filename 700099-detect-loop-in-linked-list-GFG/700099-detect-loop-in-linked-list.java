/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        boolean flag = false;
        while(temp!=null){
            if(set.contains(temp)){
                flag = true;
                break;
            }
            set.add(temp);
            temp = temp.next;
        }
        return flag;
        
    }
}