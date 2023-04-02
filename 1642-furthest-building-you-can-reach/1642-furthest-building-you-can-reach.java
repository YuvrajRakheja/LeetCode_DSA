//TC-0(N)
//SC-0(N)

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<heights.length-1;i++){
            if(heights[i+1]-heights[i]>0){
                int diff=heights[i+1]-heights[i];
                pq.add(diff);
            }
            if(pq.size()>ladders){//logic is use ladders at last use bricks pehle and when bricks khatam then return.
                bricks-=pq.remove();
            }
            if(bricks<0)    return i;
        }
        return heights.length-1;
    }
}