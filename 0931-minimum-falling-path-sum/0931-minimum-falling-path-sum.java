//TC-0(N*N)
//SC-0(N*N)
//TABULATION
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            dp[0][i]=matrix[0][i];
        }//BASE CASE
        
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int up=matrix[i][j]+dp[i-1][j];
                int upleft=matrix[i][j];
                
                if(j-1>=0){
                    upleft+=dp[i-1][j-1];
                }else{
                    upleft+=Math.pow(10,9);
                }
                
                int upright=matrix[i][j];
                
                if(j+1<matrix.length){
                    upright+=dp[i-1][j+1];
                }else{
                    upright+=Math.pow(10,9);
                }
                
                dp[i][j]=Math.min(up,Math.min(upleft,upright));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            min=Math.min(min,dp[matrix.length-1][i]);
        }
        return min;
    }
}