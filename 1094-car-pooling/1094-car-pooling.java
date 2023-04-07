//TC-0(NLOGN)
//SC-0(N)
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int lastlocation=Integer.MIN_VALUE;
        for(int[] i:trips){
            lastlocation=Math.max(lastlocation,i[2]);        
        }
        int[] highway=new int[lastlocation+1];
        
        for(int[] trip:trips){
            highway[trip[1]]+=trip[0];
            highway[trip[2]]-=trip[0];
        }
        
        for(int i=0;i<=lastlocation;i++){
            highway[i]+=(i==0)?0:highway[i-1];
            if(highway[i]>capacity){
                return false;
            }
        }
        return true;
    }
}