//TC-0(N^N)
//SC-0(N*N+N)//DP SPACE+AUXILLIARY STACK SPACE
//MEMOIZATION
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dp[i][j]=-1;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int curr=helper(matrix.length-1,i,matrix,dp);
            min=Math.min(min,curr);
        }
        
        return min;
    }
    public int helper(int row,int col,int[][] matrix,int[][] dp){
        if(col<0 || col>=matrix.length){
            return (int)Math.pow(10,9);
        }
        
        if(row==0){
            return matrix[0][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
                
        int up=matrix[row][col]+helper(row-1,col,matrix,dp);
        int up_left=matrix[row][col]+helper(row-1,col-1,matrix,dp);
        int up_right=matrix[row][col]+helper(row-1,col+1,matrix,dp);
        
        return dp[row][col]=(int)Math.min(up,Math.min(up_left,up_right));
    }
}