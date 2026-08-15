class MyQueue {
    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public MyQueue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }
    
    public void push(int x) {
        stackA.push(x);
    }
    
    public int pop() {
        while(!stackA.isEmpty()){
            int t = stackA.pop();
            stackB.push(t);
        }

        int t = stackB.pop();
        while(!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
        return t;
        
    }
    
    public int peek() {
        while(!stackA.isEmpty()){
            int t = stackA.pop();
            stackB.push(t);
        }
        int t = stackB.peek();
        while(!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
        return t;
    }
    
    public boolean empty() {
        return stackA.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */