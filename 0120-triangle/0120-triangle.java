//TC-0(N*N) 
//SC-0(N*N) 
//TABULATION 
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        int row=triangle.size(),col=triangle.size();
        
        for(int j=0;j<col;j++){
            dp[row-1][j]=triangle.get(row-1).get(j);
        }
        for(int i=row-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+dp[i+1][j];
                int down_right=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(down,down_right);
            }
        }
        return dp[0][0];
    }
}