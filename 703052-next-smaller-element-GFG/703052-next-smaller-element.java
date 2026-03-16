class Solution {
    public ArrayList<Integer> nextSmallerEle(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                res[i] = -1;
            else
                res[i] = stack.peek();

            stack.push(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int x : res)
            list.add(x);

        return list;
    }
}