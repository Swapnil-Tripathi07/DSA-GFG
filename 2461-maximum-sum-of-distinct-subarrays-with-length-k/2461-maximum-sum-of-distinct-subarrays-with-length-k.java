class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long maxSum = 0;
        long sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            // If window size becomes more than k
            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);   //Reducing Frequency

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]); //Removing left element after decreasing frequency
                }

                sum -= nums[left];
                left++;
            }

            // If window size is k and all elements are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}