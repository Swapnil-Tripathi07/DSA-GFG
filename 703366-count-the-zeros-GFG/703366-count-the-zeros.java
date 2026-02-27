// User function Template for Java

class Solution {
     int countZeroes(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int idx = arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == 1){
                start = mid+1;
            }
            else if(arr[mid]==0){
                idx = mid;
                end = mid-1;
            }
        }
        return (arr.length-idx);
    }
}
