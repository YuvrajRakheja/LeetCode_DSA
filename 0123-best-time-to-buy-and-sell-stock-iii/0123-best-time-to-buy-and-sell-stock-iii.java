//TC-0(N*N)
//SC-0(N*3*2)
//Tabulation
class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp=new int[prices.length+1][2][3];//prices n,2 buy or sell 3 (0,1,2)transaction
        
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j][0]=0;//capacity ==0 return 0 wala base case
            }
        }
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++){
                dp[prices.length][j][k]=0;//idx==n wala base case
            }
        }
        
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<3;cap++){
                    if(buy==1){
                        dp[i][buy][cap]=Math.max(-prices[i]+dp[i+1][0][cap],0+dp[i+1][1][cap]);
                    }else{
                        dp[i][buy][cap]=Math.max(prices[i]+dp[i+1][1][cap-1],dp[i+1][0][cap]);
                    }
                }
            }
        }
        return dp[0][1][2];        
    }
}