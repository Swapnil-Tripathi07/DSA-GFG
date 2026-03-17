class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        for(int i = 0 ; i<gain.length ; i++){
            sum = sum+gain[i];
            gain[i] = sum;
        }
        int max = 0;
        for(int i = 0 ;i<gain.length;i++){
            if(gain[i]>max){
                max = gain[i];
            }
        }
        return max;
    }
}