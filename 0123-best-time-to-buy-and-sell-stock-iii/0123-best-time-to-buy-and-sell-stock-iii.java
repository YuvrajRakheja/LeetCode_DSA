//TC-0(N*2*3)
//SC-0(3*2)--0(1)
//SPACE OPTIMIZATION
class Solution {
    public int maxProfit(int[] prices) {
        int[][] after=new int[2][3];//2 buy or sell 3 (1,2)transaction
        int[][] curr=new int[2][3];//2 buy or sell 3 (1,2)transaction
                
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++){
                after[j][k]=0;//idx==n wala base case
            }
        }
        
        for(int i=prices.length-1;i>=0;i--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<3;cap++){
                    if(buy==1){
                        curr[buy][cap]=Math.max(-prices[i]+after[0][cap],0+after[1][cap]);
                    }else{
                        curr[buy][cap]=Math.max(prices[i]+after[1][cap-1],after[0][cap]);
                    }
                }
            }
            after=curr;
        }
        return after[1][2];        
    }
}