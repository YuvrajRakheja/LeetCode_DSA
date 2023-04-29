//TABULATION
class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxlen=1;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        
        for(int i=0;i<nums.length;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev]){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}