//TC-0(N*2)
//SC-0(N*2)+0(N)
//MEMOIZATION
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,prices,1,fee,dp);
    }
    public int helper(int idx,int[] prices,int buy,int fee,int[][] dp){
        if(idx==prices.length)  return 0;
        if(dp[idx][buy]!=-1)    return dp[idx][buy];
        
        if(buy==1){
            return dp[idx][buy]=(int)Math.max(-prices[idx]+helper(idx+1,prices,0,fee,dp),helper(idx+1,prices,1,fee,dp));
        }else{
            return dp[idx][buy]=(int)Math.max(prices[idx]-fee+helper(idx+1,prices,1,fee,dp),helper(idx+1,prices,0,fee,dp));
        }
    }
}