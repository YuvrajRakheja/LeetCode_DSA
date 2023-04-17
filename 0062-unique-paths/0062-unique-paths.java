//TC-0(M*N)
//SC-0(M*N)
//TABULATION
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=((i>0)?dp[i-1][j]:0)+((j>0)?dp[i][j-1]:0);
                }
            }
        }
        return dp[m-1][n-1];
    }
}