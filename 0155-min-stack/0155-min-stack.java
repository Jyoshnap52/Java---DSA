class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();//min element stack


    public MinStack() {
        
    }
    
    public void push(int value) {
        stack1.push(value);
        if(stack2.isEmpty() || stack2.peek() > value){
            stack2.push(value);
        }else{
            stack2.push(stack2.peek());
        }
        
    }
    
    public void pop() {
        if(!stack1.isEmpty() && !stack2.isEmpty()){
            stack1.pop();
            stack2.pop();
        }
        
    }
    
    public int top() {
        return stack1.peek();
        
    }
    
    public int getMin() {
        return stack2.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */