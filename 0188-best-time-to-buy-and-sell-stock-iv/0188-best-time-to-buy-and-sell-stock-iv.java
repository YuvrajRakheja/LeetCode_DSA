//TC-0(N*2*K)
//SC-0(N*2*K)+0(n)
//Memoization
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] dp=new int[prices.length][k*2];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<2*k;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,prices,0,k,dp);
    }
    public int helper(int idx,int[] prices,int cap,int k,int[][] dp){
        if(idx==prices.length||cap==2*k)  return 0;
        
        if(dp[idx][cap]!=-1)    return dp[idx][cap];
        
        if(cap%2==0){//buy case
            return dp[idx][cap]=(int)Math.max(-prices[idx]+helper(idx+1,prices,cap+1,k,dp),0+helper(idx+1,prices,cap,k,dp));//first is we bought share and second we didnt buy 
        }else{//sell case
            return dp[idx][cap]=(int)Math.max(prices[idx]+helper(idx+1,prices,cap+1,k,dp),0+helper(idx+1,prices,cap,k,dp));//first is sell case and second we didnt sell
        }
    }
}