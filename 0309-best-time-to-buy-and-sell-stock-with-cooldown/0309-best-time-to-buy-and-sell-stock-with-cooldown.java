//TC-0(N*2)
//SC-0(N*2)+0(N)
//MEMOIZATION
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,prices,1,dp);
    }
    public int helper(int idx,int[] prices,int buy,int[][] dp){
        if(idx>=prices.length)  return 0;
        if(dp[idx][buy]!=-1)    return dp[idx][buy];
        
        if(buy==1){
            return dp[idx][buy]=(int)Math.max(-prices[idx]+helper(idx+1,prices,0,dp),helper(idx+1,prices,1,dp));
        }else{
            return dp[idx][buy]=(int)Math.max(prices[idx]+helper(idx+2,prices,1,dp),helper(idx+1,prices,0,dp));
        }
    }
}