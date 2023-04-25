class SmallestInfiniteSet {
    private PriorityQueue<Integer> pq=null;
    private Set<Integer> set=null;
    
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        set=new HashSet<>();
        
        for(int i=1;i<=1000;i++){
            pq.add(i);//0(1)
            set.add(i);//0(logn)
        }
    }
    
    public int popSmallest() {
        int x=pq.poll();//0(logn)
        set.remove(x);//0(1)
        return x;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){//pq.contains(num) has time complexity of 0(n) and set.contains(num) has 0(1) time that is why we are using 2 data structure else it can be donw only by pq also
            pq.add(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */