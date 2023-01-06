//TC-0(NLOGN)
//SC-0(1)
//BRUTE FORCE
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cream=0;
        
        for(int i=0;i<=costs.length-1;i++){
             if(coins>=costs[i]){
                 cream++;
                 coins-=costs[i];
             }else{
                 break;
             }
        }
        return cream;
    }
}