//TC-0(M*N)
//SC-0(M) DP SPACE
//TABULATION SPACE OPTIMIZED
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
        int[] curr=new int[n];
        int[] prev=new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    curr[j]=0;
                }else if(i==0 && j==0){
                    curr[j]=1;
                }else{
                    int up=(i>0)?prev[j]:0;
                    int down=(j>0)?curr[j-1]:0;
                    curr[j]=up+down;
                }
            }
            prev=curr;
        }
        return prev[n-1];
    }
}