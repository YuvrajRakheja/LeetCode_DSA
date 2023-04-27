//TC-0(N*2*K)
//SC-0(N*2*K)
//Tabulation
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][] dp=new int[prices.length+1][k*2+1];
        
        for(int i=0;i<2*k;i++){
            dp[prices.length][i]=0;//idx==prices.length return 0;
        }
        for(int i=0;i<prices.length;i++){
            dp[i][2*k]=0;
        }
        
        for(int i=prices.length-1;i>=0;i--){
            for(int tran_no=2*k-1;tran_no>=0;tran_no--){
                if(tran_no%2==0){//buy case
                    dp[i][tran_no]=(int)Math.max(-prices[i]+dp[i+1][tran_no+1],0+dp[i+1][tran_no]);//first is we bought share and second we didnt buy 
                }else{//sell case
                    dp[i][tran_no]=(int)Math.max(prices[i]+dp[i+1][tran_no+1],0+dp[i+1][tran_no]);//first is sell case and second we didnt sell
                }
            }
        }
        return dp[0][0];
    }
}