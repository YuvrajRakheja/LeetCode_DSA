//TC-0(N)
//SC-0(N+n)
//MEMOIZATION
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=helper(nums,nums.length-1,dp);
        return ans;
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx==0)  return nums[0];
        if(idx<0)   return 0;
        if(dp[idx]!=-1) return dp[idx];
        
        int rob_this_house=nums[idx]+helper(nums,idx-2,dp);
        int not_rob=helper(nums,idx-1,dp);
        
        return dp[idx]=(int)Math.max(rob_this_house,not_rob);
    }
}