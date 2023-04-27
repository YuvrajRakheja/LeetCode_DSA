//TC-0(N*2*K)
//SC-0(N*2*K)
//Space Optimization
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] after=new int[2*k+1];
        int[] curr=new int[2*k+1];
    
        for(int i=0;i<2*k;i++){
            after[i]=0;//idx==prices.length return 0;
        }    
        
        for(int i=prices.length-1;i>=0;i--){
            for(int tran_no=2*k-1;tran_no>=0;tran_no--){
                if(tran_no%2==0){//buy case
                    curr[tran_no]=(int)Math.max(-prices[i]+after[tran_no+1],0+after[tran_no]);//first is we bought share and second we didnt buy 
                }else{//sell case
                    curr[tran_no]=(int)Math.max(prices[i]+after[tran_no+1],0+after[tran_no]);//first is sell case and second we didnt sell
                }
            }
            after=curr;
        }
        return after[0];
    }
}