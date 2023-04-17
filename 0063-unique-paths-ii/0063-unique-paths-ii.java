//TC-0(M*N)
//SC-0(M*N)+0(M+N) DP SPACE+RECURSION STACK SPACE
//MEMOIZATION
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int[][] dp=new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return uniquepath(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,dp);
    }
    public int uniquepath(int m,int n,int[][] grid,int[][] dp){
        if(m>=0 && n>=0 && grid[m][n]==1)   return 0;//obstacle
        if(m==0 && n==0)    return 1;
        if(m<0 || n<0)  return 0;
        if(dp[m][n]!=-1)    return dp[m][n];//memoization
        
        int left=uniquepath(m,n-1,grid,dp);
        int right=uniquepath(m-1,n,grid,dp);
        
        return dp[m][n]=left+right;
    }
}