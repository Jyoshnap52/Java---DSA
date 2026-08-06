class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temps = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!temps.isEmpty() && temperatures[i] > temperatures[temps.peek()]){
                int popped = temps.pop();
                ans[popped] = i - popped;

            }
            temps.push(i);
        }

        return ans;
        
        
    }
}