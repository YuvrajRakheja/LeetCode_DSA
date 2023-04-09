//TC-0(N)
//SC-0(n+n)
//Memoized
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans=helper(n,dp);
        return ans;
    }
    public int helper(int n,int[] dp){
        if(n==1||n==0){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        
        int s1=helper(n-1,dp);
        int s2=0;
        if(n>1){
            s2=helper(n-2,dp);
        }
        dp[n]=s1+s2;
        return dp[n];
    }
}