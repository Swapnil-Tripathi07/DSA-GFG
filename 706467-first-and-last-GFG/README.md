# [First and Last](https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x2041/1?sortBy=submissions&category%5B%5D=Searching&page=1&difficulty%5B%5D=-1)
## Easy
Given an element x and a sorted array, arr[], find the&nbsp;indices of first and last occurrences of the x's in the array.
Note: If the number x is not found in the array, return an array containing -1 only.
Examples:
Input: x = 3, arr[] = [1, 3, 3, 4]
Output: [1, 2]
Explanation: The first occurrence of X = 3 is at index = 1 and the last at index = 2.
Input: x = 5, arr[] = [1, 2, 3, 4]
Output: [-1]
Explanation: 5 is not present, so the answer is -1.
Expected Time Complexity: O(log n)Expected Auxillary Space: O(1)
Constraints:&nbsp;1 &lt;= arr.size() &lt;= 105&nbsp;0 &lt;= arr[i], x &lt;= 109