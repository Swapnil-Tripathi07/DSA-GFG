/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while(current!=null){
            stack.push(current.data);
            current = current.next;
        }
        current = head;
        while(!stack.isEmpty() && current!=null){
            if(current.data == stack.peek()){
                current = current.next;
                stack.pop();
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}