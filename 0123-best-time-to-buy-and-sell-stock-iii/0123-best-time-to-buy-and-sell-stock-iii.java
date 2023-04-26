//TC-0(N*N)
//SC-0(N*3*2)+0(N)
//MEMOIZATION
class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp=new int[prices.length][2][3];//prices n,2 buy or sell 3 (0,1,2)transaction
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return helper(0,1,prices,2,dp);
    }
    public int helper(int idx,int buy,int[] prices,int cap,int[][][] dp){
        if(cap==0)  return 0;
        if(idx==prices.length)  return 0;
        if(dp[idx][buy][cap]!=-1)    return dp[idx][buy][cap];
        
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[idx]+helper(idx+1,0,prices,cap,dp),0+helper(idx+1,1,prices,cap,dp));
        }else{//sell
            profit=Math.max(prices[idx]+helper(idx+1,1,prices,cap-1,dp),0+helper(idx+1,0,prices,cap,dp));
        }
        return dp[idx][buy][cap]=profit;                            
    }
}