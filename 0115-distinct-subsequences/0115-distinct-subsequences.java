//TC-0(M*N)
//SC-0(M*N)+0(M+N)
//MEMOIZATION

class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(s.length()-1,s,t.length()-1,t,dp);
    }
    public int helper(int i,String s,int j,String t,int[][] dp){
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            int take=helper(i-1,s,j-1,t,dp);
            int nottake=helper(i-1,s,j,t,dp);
            
            return dp[i][j]=take+nottake;
        }else{
            return dp[i][j]=helper(i-1,s,j,t,dp);
        }
    }
}