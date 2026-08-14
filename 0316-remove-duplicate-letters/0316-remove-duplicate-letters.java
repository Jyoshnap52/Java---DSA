class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            map.put(cur,map.get(cur) - 1);

            if(stack.contains(cur)){
                stack.push(cur);
                stack.pop(); 
            }
            else{
                while(!stack.isEmpty() && stack.peek() > cur && map.get(stack.peek()) > 0){
                    stack.pop();
                }
                stack.push(cur);
                
            }
            
        }

        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.peek());
            stack.pop();
        }

        return ans.reverse().toString();
        
    }
}

