class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s_num2 = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            int cur = nums2[i];
            while(!s_num2.isEmpty() && cur > s_num2.peek()){
                map.put(s_num2.peek(),cur);
                s_num2.pop();
            }
            s_num2.push(cur);
        }
        while(!s_num2.isEmpty()){
            map.put(s_num2.peek(),-1);
            s_num2.pop();
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;

        
        
    }
}