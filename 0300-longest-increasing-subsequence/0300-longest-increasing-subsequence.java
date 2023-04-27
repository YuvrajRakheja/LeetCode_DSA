//TC-0(n*n)
//SC-0(n*n)+0(n)
//Memoization
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        //since prev_index varies from -1 to nums.length-1 so total nums.length+1 and we have done coordinate change
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,-1,nums,dp);
    }
    public int helper(int idx,int prev_idx,int[] nums,int[][] dp){
        if(idx==nums.length)    return 0;
        if(dp[idx][prev_idx+1]!=-1)   return dp[idx][prev_idx+1];
        
        int len=0+helper(idx+1,prev_idx,nums,dp);//NOT_TAKE
        
        if(prev_idx+1==0 || nums[idx]>nums[prev_idx]){
            len=Math.max(len,1+helper(idx+1,idx,nums,dp));//TAKE
        }
        return dp[idx][prev_idx+1]=len;
    }
}