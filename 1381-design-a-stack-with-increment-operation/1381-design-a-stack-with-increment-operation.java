//https://www.youtube.com/watch?v=-CXN5Nh9jOA&list=TLGGDO3AAo0tR9AwODAzMjAyMw
class CustomStack {
    int[] value;
    int[] increment;
    int index;
    
    public CustomStack(int maxSize) {
        value=new int[maxSize];
        increment=new int[maxSize];
        index=-1;
    }
    
    public void push(int x) {
        if(index+1==value.length){
            return;
        }
        index++;
        value[index]=x;
        increment[index]=0;
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
        int vl=value[index];
        int incr=increment[index];
        
        index--;
        if(index>=0){
            increment[index]+=incr;   
        }
        return vl+incr;
    }
    
    public void increment(int k, int val) {
        int idx=Math.min(k-1,index);//matlab if 3 elements and k=5 toh hum sirf 3 element hi karenge toh index=2 hoga
        if(idx>=0){
            increment[idx]+=val;   
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */