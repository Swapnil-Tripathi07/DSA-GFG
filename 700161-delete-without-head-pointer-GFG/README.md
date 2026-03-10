# [Delete without head pointer](https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?sortBy=submissions&category%5B%5D=Linked%2520List&page=1&difficulty%5B%5D=0)
## Medium
You are given a node del_node of a Singly Linked List where you have to delete this&nbsp;given node from the linked list but you are not given the head of the list.
After deleting the given node:

The number of nodes in the linked list should decrease by one.
All the values before &amp; after the del_node node should be in the same order.

Note: It is guaranteed that there exists a node with a value equal to the del_node value and it will not be the last node of the linked list.
Examples:
Input: Linked List = 1 -&gt; 2, del_node = 1
Output: 2
Explanation: After deleting 1 from the linked list, we have remaining nodes as 2. 
Input: Linked List = 10 -&gt; 20 -&gt; 4 -&gt; 30, del_node = 20
Output: 10-&gt;4-&gt;30
Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4, 30.
Constraints:2 ≤ number of nodes ≤ 106&nbsp;&nbsp;1 ≤ node-&gt;data ≤ 106