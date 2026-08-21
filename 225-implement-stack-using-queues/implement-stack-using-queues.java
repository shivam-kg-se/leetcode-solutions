class MyStack {
    Queue<Integer> obj = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        obj.offer(x);
        int size = obj.size();
        for(int i=0;i<size-1;i++){
            obj.offer(obj.poll());
        }
    }
    
    public int pop() {
        return obj.poll();
    }
    
    public int top() {
        return obj.peek();
    }
    
    public boolean empty() {
        return obj.isEmpty();
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