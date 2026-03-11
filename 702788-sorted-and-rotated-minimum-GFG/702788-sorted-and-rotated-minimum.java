class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=arr[end]){
                start = mid+1;
            }
            else{
                end = mid;;
            }
            result = arr[mid];
        }
        return result;
    }
}
