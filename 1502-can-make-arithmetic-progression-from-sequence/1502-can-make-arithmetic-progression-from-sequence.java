class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int first=pq.remove(),second=pq.remove();
        
        int diff=second-first;
        pq.add(second);
        
        while(pq.size()>1){
            int nfirst=pq.remove(),nsecond=pq.remove();
            
            int ndf=nsecond-nfirst;
            if(diff!=ndf)   return false;
            pq.add(nsecond);
        }
        return true;
    }
}