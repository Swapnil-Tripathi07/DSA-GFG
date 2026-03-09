# [Insert in Middle of Linked List](https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?sortBy=submissions&category%5B%5D=Linked%2520List&page=1&difficulty%5B%5D=-1)
## Easy
Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.
Examples :
Input: LinkedList = 1-&gt;2-&gt;4 , x = 3
Output: 1-&gt;2-&gt;3-&gt;4
Explanation: The new element is inserted after the current middle element in the linked list.
Input: LinkedList = 10-&gt;20-&gt;40-&gt;50 , x = 30
Output: 10-&gt;20-&gt;30-&gt;40-&gt;50
Explanation: The new element is inserted after the current middle element in the linked list and Hence, the output is 10-&gt;20-&gt;30-&gt;40-&gt;50.
Expected Time Complexity: O(n)Expected Auxilliary Space: O(1)
Constraints:0 &lt;= number of nodes &lt;= 1050 &lt;= node-&gt;data , x &lt;= 103