//TC-0(N)
//SC-0(1)

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;
        
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        
        int start=0,remaininggas=0;
        
        for(int i=0;i<gas.length;i++){
            remaininggas=remaininggas+(gas[i]-cost[i]);
            
            if(remaininggas<0){//not good place to start
                start=i+1;//start from next index
                remaininggas=0;//and start afresh ith remaininggas=0 from i+1
            }
        }
        return start;
    }
}