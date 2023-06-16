//TC-0(N)
//SC-0(N)
//1 QUEUE
class MyStack {
    Queue<Integer> q1;
    public MyStack() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for(int i=0;i<q1.size()-1;i++){
               q1.add(q1.peek());
               q1.remove();
        }        
    }
    
    public int pop() {
        if(q1.size()==0) return -1;
        
        int ele=q1.remove();
        return ele;
    }
    
    public int top() {
        if(q1.size()==0) return -1;
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.size()==0;
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