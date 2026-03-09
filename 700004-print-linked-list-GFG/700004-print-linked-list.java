/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            arrList.add(temp.data);
            temp = temp.next;
        }
        return arrList;
        
    }
}