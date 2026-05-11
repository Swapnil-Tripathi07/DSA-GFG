class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int i = 0;
        int j = k-1;
        int maxSum = 0;
        int sum = 0;
        for(int n = 0 ; n<k ; n++){
            sum += arr[n];
        }
        maxSum = sum;
        while(j<arr.length-1){
            sum -= arr[i];
            i++;
            j++;
            sum += arr[j];
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
        
    }
}