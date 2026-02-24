class Solution {
    int search(int[] nums , int target){
        int pivot = findPivot(nums);

        // if you did not find a pivot, int means the array is not rotated.
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }
        // if pivot is found, you have found 2 ascending arrays.
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    int binarySearch(int[] arr , int target , int start, int end) {
        while (start <= end) {
            // Find the middle element
            //int mid = (start-end)/2 // this might be possible that it exceeds the range of Integer.
            // so the another formulae is that
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }

    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here
            if( mid < end && arr[mid]>arr[mid+1]){//mid<end because when the mid is last postion so the mid+1 is array out of bound exception
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{   //arr[start]<arr[mid]
                 start = mid+1;
            }
        }
        return -1;
    }
}