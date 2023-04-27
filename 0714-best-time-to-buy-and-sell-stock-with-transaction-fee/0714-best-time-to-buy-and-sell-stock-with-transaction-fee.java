//TC-0(N*2)
//SC-0(N*2)
//Tabulation
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp=new int[prices.length+1][2];
        
        dp[prices.length][0]=dp[prices.length][0]=0;//base case
        
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                    dp[i][buy]=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }else{
                    dp[i][buy]=Math.max(prices[i]-fee+dp[i+1][1],dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
}