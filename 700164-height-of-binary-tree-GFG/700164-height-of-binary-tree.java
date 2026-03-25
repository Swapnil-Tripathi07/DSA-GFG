/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        int[] count = new int[2];
        height(root,count);
        return count[0]-1;
        
    }
    
    public void height(Node node , int[] count){
        if(node == null){
            return;
        }
        count[1]++;
        if(node.left == null && node.right == null){
            count[0] = Math.max(count[0],count[1]);
        }
        height(node.left,count);
        height(node.right,count);
        count[1]--;
    }
}