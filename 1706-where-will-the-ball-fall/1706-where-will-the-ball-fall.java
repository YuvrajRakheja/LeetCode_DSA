//TC-0(ROW*COL)
//SC-0(N)
class Solution {
    public int[] findBall(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int[] ans=new int[n];
        
        for(int j=0;j<n;j++){
            ans[j]=dfs(grid,0,j);
        }
        return ans;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i>=grid.length){
            return j;
        }
        //left to right
        if(grid[i][j]==1 && j+1<grid[0].length && grid[i][j+1]==1){//matlab index will move to i+1,j+1 as 1 se we move left to right once
            return dfs(grid,i+1,j+1);
        }else if(grid[i][j]==-1 && j-1>=0 && grid[i][j-1]==-1){//right to left
            return dfs(grid,i+1,j-1);
        }else if(grid[i][j]==1 && j+1>=grid[0].length){
            return -1;
        }else{
            return -1;
        }
    }
}