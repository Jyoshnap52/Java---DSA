class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        int cur;
        for(int i = 0; i < nums.length; i++){
            cur = i;
            while(!stack.isEmpty() && nums[cur] > nums[stack.peek()]){
                ans[stack.peek()] = nums[cur];
                stack.pop();   
            }
            stack.push(cur);
        }
        if(!stack.isEmpty()){
            for(int i = 0; i < nums.length; i++){
                cur = i;
                while(nums[cur] > nums[stack.peek()]){
                    ans[stack.peek()] = nums[cur];
                    stack.pop();
                }
            }
        }

        return ans;
        
    }
}