//TC-0(M*N) 
//SC-0(M*N)+0(M+N) DP SPACE+RECURSION STACK SPACE
//MEMOIZATION
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return minSum(grid.length-1,grid[0].length-1,grid,dp);
    }
    public int minSum(int m,int n,int[][] grid,int[][] dp){
        if(m==0 && n==0)    return grid[0][0];
        if(m<0 || n<0)  return (int)Math.pow(10,9);// delibrately put big number as if we put Integer.MAX_VALUE then it will be grid[m][n and make the answer -ve by integer overflow
        
        if(dp[m][n]!=-1)    return dp[m][n];
        
        int up=grid[m][n]+minSum(m-1,n,grid,dp);
        int left=grid[m][n]+minSum(m,n-1,grid,dp);
        
        return dp[m][n]=(int)Math.min(up,left);
    }
}