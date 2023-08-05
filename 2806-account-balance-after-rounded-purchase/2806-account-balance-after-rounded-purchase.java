class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int ans=100;
        int sub=purchaseAmount%10;
        
        if(sub==0)  return ans-purchaseAmount;
        else if(sub<5) return ans-purchaseAmount+(purchaseAmount%10); 
        else if(sub==5){
            ans-=purchaseAmount;
            ans-=5;
        }else{
            ans-=purchaseAmount;
            ans-=(10-(purchaseAmount%10));
        }
        return ans;
    }
}