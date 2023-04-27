//TC-0(N*2)
//SC-0(4)
//Space Optimization
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[] after=new int[2];
        int[] curr=new int[2];
        
        after[0]=after[1]=0;//base case
        
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                    curr[buy]=Math.max(-prices[i]+after[0],after[1]);
                }else{
                    curr[buy]=Math.max(prices[i]-fee+after[1],after[0]);
                }
            }
            after=(int[])curr.clone();
        }
        return after[1];
    }
}