//TC-0(N)+0(N)
//SC-0(N)
//Memoization
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)  return nums[0];
        
        int[] t1=new int[nums.length-1];
        int[] t2=new int[nums.length-1];
        
        int[] dp1=new int[nums.length-1];
        int[] dp2=new int[nums.length-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        
        for(int i=0;i<nums.length;i++){
            if(i!=0)    t1[i-1]=nums[i];
            if(i!=nums.length-1)    t2[i]=nums[i];
        }
        return (int)Math.max(helper(t1,t1.length-1,dp1),helper(t2,t2.length-1,dp2));
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx==0)  return nums[0];
        if(idx<0)   return 0;
        if(dp[idx]!=-1)     return dp[idx];
        
        int take=helper(nums,idx-2,dp)+nums[idx];
        int not_take=helper(nums,idx-1,dp);
        
        return dp[idx]=(int)Math.max(take,not_take);
    }
}