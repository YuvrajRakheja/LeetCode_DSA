//TC-0(M^N)
//SC-0(N)
//RECURSIVE
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,nums1.length,nums1,0,nums2.length,nums2,dp);
    }
    public int helper(int i1,int len1,int[] num1,int i2,int len2,int[] num2,int[][] dp){
        if(i1>=len1||i2>=len2){
            return 0;
        }
        if(dp[i1][i2]!=-1)  return dp[i1][i2];
        
        if(num1[i1]==num2[i2]){
            int take=1+helper(i1+1,len1,num1,i2+1,len2,num2,dp);   
            return dp[i1][i2]=take;
        }else{
            int nottake=Math.max(helper(i1+1,len1,num1,i2,len2,num2,dp),helper(i1,len1,num1,i2+1,len2,num2,dp));    
            return dp[i1][i2]=nottake;
        }
    }
}