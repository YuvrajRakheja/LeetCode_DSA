class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> num=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            num.add(stones[i]);
        }
        
        while(num.size()>1){
            int heavy=num.remove();
            int secondheavy=num.remove();
            
            if(heavy==secondheavy){
                continue;
            }else{
                num.offer(heavy-secondheavy);
            }
        }
        return (num.size()==1)?num.remove():0;
    }
}