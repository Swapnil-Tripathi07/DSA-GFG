class Solution {
    public ArrayList<Integer> firstAndLast(int x, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int start = search(arr, x , true);
        int end = search(arr , x , false);

        list.add(start);
        list.add(end);
        if(list.get(0) == -1){
            list1.add(-1);
            return list1;
        }
        else{
            return list;
        }
    }
     int search(int[] nums , int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }

            else if(target > nums[mid]){
                start = mid+1;
            }

            else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

