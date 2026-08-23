class MyStack {

    List<Integer> stack;
    int size;
    int front;
    int rear;

    public MyStack() {
        stack = new ArrayList<>();
        size = 0;
        front = -1;
        rear = -1;
    }
    
    public void push(int x) {
        size++;
        front++;
        stack.add(x);
    }
    
    public int pop() {
        int val = stack.get(front);
        front--;
        size--;
        return val;
    }
    
    public int top() {
        return stack.get(front);
    }
    
    public boolean empty() {
        return size == 0;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */