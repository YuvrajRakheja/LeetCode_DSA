//TC-0(N^N)
//SC-0(n*n)+0(N)
//MEMOIZATION
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,triangle,dp);
    }
    public int helper(int row,int col,List<List<Integer>> triangle,int[][] dp){
        if(row==triangle.size()-1){
            return triangle.get(row).get(col);
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int down=triangle.get(row).get(col)+helper(row+1,col,triangle,dp);
        int up=triangle.get(row).get(col)+helper(row+1,col+1,triangle,dp);
        
        return dp[row][col]=(int)Math.min(up,down);
    }
}