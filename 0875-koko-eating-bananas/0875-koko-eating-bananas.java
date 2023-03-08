//TC-0(LOGN)
//SC-0(1)
//CHECK OUT WHY  [805306368,805306368,805306368]
//               1000000000   TESTCASE IS NOT WORKING WHEN WE DO LOW<=HIGH AND UPDATE HIGH=MID-1;
class Solution {
    public boolean calc_totaltime(int[] piles,int h,long n){
        int time=0;
        for(int val:piles){
            time+=val/n;
            if(val%n!=0){
                time++;//as if 6 and n is 5 then we take 2 time
            }
        }
        return time<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long low=1;
        long high=piles[0];
        
        for(int p:piles){
            high=Math.max(high,p);
        }
        
        while(low<high){//if we do high=mid then we can do till low<high
            long mid=low+((high-low)>>1);
            
            if(!calc_totaltime(piles,h,mid)){
                low=mid+1;//increase eating speed
            }else{//that is when tt<=h
                high=mid;
            }
        }
        return (int)low;
    }
}