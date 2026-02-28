class Solution {
    public int findFloor(int[] arr, int x) {
        int target = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<=x){
                target = i;
            }
            else{
                break;
            }
        }
        return target;
        
    }
}
