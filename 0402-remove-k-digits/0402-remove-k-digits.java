class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        if(k == num.length()){
            return "0";
        }
        for(int i = 0; i < num.length(); i++){
            char cur = num.charAt(i);
            while(!stack.isEmpty() && k != 0 && cur < stack.peek()){
                stack.pop();
                k--;  
            }
            stack.push(cur);
            
        }
        while(k > 0){
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.peek());
            stack.pop();
        }
        String result = ans.reverse().toString();

        int i = 0;
        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        result = result.substring(i);
        if(result.isEmpty()){
            return "0";
        }
        return result;
        
        
    }
}