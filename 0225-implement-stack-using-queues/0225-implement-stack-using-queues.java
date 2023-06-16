//TC-0(N+N)
//SC-0(N)
//2 QUEUES
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;  
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
               q2.add(q1.peek());
               q1.remove();
        }
        q1=q2;
        q2=new LinkedList<>();
        
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