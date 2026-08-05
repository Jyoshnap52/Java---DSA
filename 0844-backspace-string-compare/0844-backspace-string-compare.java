class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_s = new Stack<>();
        Stack<Character> stack_t = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(ch != '#'){    
                stack_s.push(ch);   
            }else{
                if(!stack_s.isEmpty()){
                    stack_s.pop();
                }    
            }
        }

        for(int i = 0; i < t.length(); i++){
            Character ch = t.charAt(i);
            if(ch != '#'){
                stack_t.push(ch);
            }else{
                if(!stack_t.isEmpty()){
                    stack_t.pop();
                } 
            }
        }
        

        if(stack_s.size() == stack_t.size()){
            while(!(stack_s.isEmpty() && stack_t.isEmpty())){
                if(stack_s.peek() != stack_t.peek()){
                    return false;
                }else{
                    stack_s.pop();
                    stack_t.pop();
                }
            }
            
        }else{
            return false;
        }

        return true;

        
    }
}