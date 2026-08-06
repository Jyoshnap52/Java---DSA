class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            
            while(!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]){
                int wait_day = temp.pop();
                ans[wait_day] = i - wait_day;
                 
            }
            temp.push(i);
        }
        return ans;
        
    }
}