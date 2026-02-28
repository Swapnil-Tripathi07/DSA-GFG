class Solution {
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr){
        for(int i = 0 ; i<=arr.length-1 ; i++){
            // Find the max item in the remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;  // It gives the last index.
            int maxIndex = getMaxIndex(arr,0,lastIndex);

            swap(arr , maxIndex , lastIndex);
        }
    }

    static int getMaxIndex(int[] arr , int start , int end){
        int max = start;
        for(int i = start; i<= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}