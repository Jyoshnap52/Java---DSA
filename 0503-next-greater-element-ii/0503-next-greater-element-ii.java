class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];

        Arrays.fill(ans, -1);

        // We traverse twice because the array is circular
        for (int i = 0; i < 2 * nums.length; i++) {

            int cur = nums[i % nums.length];

            while (!stack.isEmpty() && nums[stack.peek()] < cur) {
                ans[stack.pop()] = cur;
            }

            // Only push indexes during the first pass
            if (i < nums.length) {
                stack.push(i);
            }
        }

        return ans;
    }
}