//https://www.youtube.com/watch?v=PeAN0lWOzak
class SummaryRanges {
    TreeSet<Integer> numbers;
    public SummaryRanges() {
        numbers=new TreeSet<>();
    }
    
    public void addNum(int value) {
        numbers.add(value);
    }
    
    public int[][] getIntervals() {
        List<int[]> disjointInterval=new ArrayList<>();
        
        for(int num:numbers){
            int size=disjointInterval.size();
            
            if(size>0 && disjointInterval.get(size-1)[1]+1==num){
                disjointInterval.get(size-1)[1]=num;
                //merge update the right end state
            }else{
                disjointInterval.add(new int[]{num,num});
            }
        }
        return disjointInterval.toArray(new int[0][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */