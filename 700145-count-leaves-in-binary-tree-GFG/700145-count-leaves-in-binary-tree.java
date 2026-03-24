/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        int[] count = new int[1];
        countLeaves(node , count);
        return count[0];
        
    }
    
    void countLeaves(Node node , int[] count){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            count[0]++;
        }
        countLeaves(node.left,count);
        countLeaves(node.right,count);
        
    }
}