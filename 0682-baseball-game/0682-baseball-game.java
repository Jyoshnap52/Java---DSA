class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            String ch = operations[i];
            if(!ch.equals("+") && !ch.equals("C") && !ch.equals("D")){
                stack.push(Integer.parseInt(ch));
            }else if(ch.equals("+") ){
                if(stack.isEmpty()){
                    stack.push(0);
                }else if(stack.size() == 1){
                    stack.push(stack.peek());
                }else{
                    int del = stack.pop();
                    int res = del + stack.peek();
                    stack.push(del);
                    stack.push(res);
                }

            }
            else if(ch.equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }
            else if(ch.equals("D")){
                if(!stack.isEmpty()){
                    stack.push(2 * stack.peek());
                }
            }
        }

        if(stack.isEmpty()){
            return 0;
        }

        int final_ans = 0;


        while(!stack.isEmpty()){
            int del = stack.pop();
            final_ans = final_ans + del;

        }

        return final_ans; 
    }
}