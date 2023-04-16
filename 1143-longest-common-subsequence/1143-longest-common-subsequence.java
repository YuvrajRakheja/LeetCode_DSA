//TC-0(M*N)
//SC-0(M*N)+0(M+N)//first is dp space and second is auxilliary stack space
//Memoization
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return f(text1.length()-1,text1,text2.length()-1,text2,dp);
    }
    
    public int f(int idx1,String text1,int idx2,String text2,int[][] dp){
        if(idx1<0||idx2<0)    return 0;
        
        if(dp[idx1][idx2]!=-1)  return dp[idx1][idx2];
        
        if(text1.charAt(idx1)==text2.charAt(idx2)){
            return dp[idx1][idx2]=1+f(idx1-1,text1,idx2-1,text2,dp);
        }else{
            return dp[idx1][idx2]=(int)Math.max(f(idx1-1,text1,idx2,text2,dp),f(idx1,text1,idx2-1,text2,dp));
        }
    }
}