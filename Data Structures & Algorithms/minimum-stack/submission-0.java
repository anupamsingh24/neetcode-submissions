class MinStack {

    private Stack<Integer> vals;
    private Stack<Integer> mins;

    public MinStack() {
        this.vals = new Stack<>();
        this.mins = new Stack<>();
    }
    
    public void push(int val) {
        if (this.vals.isEmpty()) {
            vals.push(val);
            mins.push(val);
        }
        
        int topMin = this.mins.peek();
        if (topMin < val) {
            mins.push(topMin);
        } else {
            mins.push(val);
        }
        this.vals.push(val);
    }
    
    public void pop() {
        this.vals.pop();
        this.mins.pop();
        
    }
    
    public int top() {
        return this.vals.peek();
        
    }
    
    public int getMin() {
        return this.mins.peek();        
    }
}
