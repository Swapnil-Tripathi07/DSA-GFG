class Solution {
    static boolean searchInSorted(int arr[], int k) {
        boolean flag = false;
        for(int i = 0 ;  i<arr.length ; i++){
            if(k == arr[i]){
                flag = true;
            }
        }
        return flag;
        
    }
}