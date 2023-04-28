//TC-0(n*n)
//SC-0(n*n)
//Tabulation

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length+1][nums.length+1];
        //since prev_index varies from -1 to nums.length-1 so total nums.length+1 and we have done coordinate change
        for(int i=0;i<nums.length+1;i++){//idx array
            dp[nums.length][i]=0;//idx=nums.length    
        }
        
        for(int i=nums.length-1;i>=0;i--){
            for(int prev_idx=i-1;prev_idx>=-1;prev_idx--){
                int nottake=0+dp[i+1][prev_idx+1];
                
                int take=0;
                if(prev_idx==-1||nums[i]>nums[prev_idx]){
                    take=1+dp[i+1][i+1];
                }
                
                dp[i][prev_idx+1]=Math.max(take,nottake);
            }
        }
        return dp[0][0];
    }
}