//TC-0(M*N) 
//SC-0(M*N) DP SPACE
//Tabulation
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[0][0];
                }else{
                    int right=grid[i][j];
                    if(j>0){
                        right+=dp[i][j-1];
                    }else{//negative base cases
                        right+=(int)Math.pow(10,9);
                    }
                    
                    int down=grid[i][j];
                    if(i>0){
                        down+=dp[i-1][j];
                    }else{//negative base cases
                        down+=(int)Math.pow(10,9);
                    }
                    dp[i][j]=Math.min(right,down);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}