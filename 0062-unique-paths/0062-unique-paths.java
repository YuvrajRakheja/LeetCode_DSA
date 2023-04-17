//TC-0(M*N) all elements have 2 path
//SC-0(M*N)+0(M+N) MEMOIZED
//SC-0(M+N) recursion stack space complexity 

//MEMOIZED
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
      return uniquePathsHelper(m - 1, n - 1,dp);
    }
    public int uniquePathsHelper(int row,int col,int[][] dp){
        if(row==0 && col==0){
            return 1;
        }
        if(row<0||col<0){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];//memoized code
        }
        int right=uniquePathsHelper(row,col-1,dp);
        int down=uniquePathsHelper(row-1,col,dp);
        
        return dp[row][col]=right+down;
    }    
}