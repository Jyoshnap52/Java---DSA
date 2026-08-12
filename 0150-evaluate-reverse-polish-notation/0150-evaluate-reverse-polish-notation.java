class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a;
        int b;
        int res;
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(token.equals("+")){
                a = stack.pop();
                b = stack.pop();
                res = (b + a);
                stack.push(res);  

            }else if(token.equals("-")){
                a = stack.pop();
                b = stack.pop();
                res = (b - a);
                stack.push(res); 

            }else if(token.equals("*")){
                a = stack.pop();
                b = stack.pop();
                res = (b * a);
                stack.push(res); 

            }else if(token.equals("/")){
                a = stack.pop();
                b = stack.pop();
                res = (b / a);
                stack.push(res); 

            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
        
    }
}