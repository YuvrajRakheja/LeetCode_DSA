class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            minprice=Math.min(prices[i],minprice);
            int profitati=prices[i]-minprice;
            
            profit=Math.max(profitati,profit);
        }
        return profit;
    }
}