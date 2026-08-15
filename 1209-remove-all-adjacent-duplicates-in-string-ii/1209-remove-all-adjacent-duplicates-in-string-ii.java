class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack_char  = new Stack<>();
        Stack<Integer> stack_count = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(stack_char.isEmpty() || stack_char.peek() != cur){
                stack_char.push(cur);
                stack_count.push(1);
            }else{
                int count = stack_count.pop();
                count++;
                stack_count.push(count);
                if(stack_count.peek() == k ){
                    stack_count.pop();
                    stack_char.pop();
                }
            }
            
        }

        StringBuilder ans = new StringBuilder();
        while(!stack_char.isEmpty()){
            int cnt = stack_count.pop();
            char ch = stack_char.pop();
            while(cnt > 0){
                ans.append(ch);
                cnt--;
            }
            

        }
        
        

        return ans.reverse().toString();
        
    }
}