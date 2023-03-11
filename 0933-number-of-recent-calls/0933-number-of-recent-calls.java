class RecentCounter {
    ArrayDeque<Integer> q;
    
    public RecentCounter() {
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.add(t);
        
        int time=t-3000;//since it is inclusive [ ] closed ends
        while(q.peek()<time){
            q.remove();//elements prior to current -3000 should be deleted to exclude them
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */