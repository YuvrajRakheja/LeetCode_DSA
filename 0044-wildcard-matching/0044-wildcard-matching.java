//TC-0(M*N)
//SC-0(M*N)+0(M+N)
//MEMOIZATION
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp=new int[s.length()][p.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(s.length()-1,s,p.length()-1,p,dp)==1?true:false;
    }
    public int helper(int i,String text,int j,String pattern,int[][] dp){
        if(i<0 && j<0)  return 1;
        if(i>=0 && j<0) return 0;
        if(j>=0 && i<0){
            for(int ii=0;ii<=j;ii++){
                if(pattern.charAt(ii)!='*'){
                    return 0;
                }
            }
            return 1;
        }//base cases
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if(text.charAt(i)==pattern.charAt(j)||pattern.charAt(j)=='?'){
            return dp[i][j]=helper(i-1,text,j-1,pattern,dp);
        }
        if(pattern.charAt(j)=='*'){
            return dp[i][j]=helper(i-1,text,j,pattern,dp)|helper(i,text,j-1,pattern,dp);
        }
        return dp[i][j]=0;
    }
}