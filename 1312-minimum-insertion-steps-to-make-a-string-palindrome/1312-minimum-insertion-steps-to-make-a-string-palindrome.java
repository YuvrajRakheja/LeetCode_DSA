//TC-0(M+N)+0(N)FOR REVERSING
//SC-0(M*N)+0(M+N)+0(M) A.STACK SPACE
//MEMOIZATION
class Solution {
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq
            (s);
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }//sb is reversed s
        
        return lcs(s,sb.toString());
    }
    public int lcs(String s1,String s2){
        int[][] dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                dp[i][j]=-1;
            }
        }
        return helper(s1.length()-1,s2.length()-1,s1,s2,dp);
    }
    public int helper(int idx1,int idx2,String s1,String s2,int[][] dp){
        if(idx1<0 || idx2<0){
            return 0;
        }
        if(dp[idx1][idx2]!=-1)  return dp[idx1][idx2];
        
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            return dp[idx1][idx2]=1+helper(idx1-1,idx2-1,s1,s2,dp);
        }
        return dp[idx1][idx2]=(int)Math.max(helper(idx1-1,idx2,s1,s2,dp),helper(idx1,idx2-1,s1,s2,dp));
    }
}