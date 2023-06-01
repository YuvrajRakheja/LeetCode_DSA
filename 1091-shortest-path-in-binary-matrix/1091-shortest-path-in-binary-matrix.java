class Solution {
    private int[][] dir=new int[][]{{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        
        if(grid[0][0]==1 ||grid[n-1][m-1]==1)   return -1;
        
        boolean[][] vis=new boolean[n][m];
        vis[0][0]=true;
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0});
            
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int j=0;j<size;j++){
                int[] pop=q.remove();

                if(pop[0]==n-1 && pop[1]==m-1)  return ans+1;

                for(int i=0;i<8;i++){
                    int nrow=pop[0]+dir[i][0];
                    int ncol=pop[1]+dir[i][1];

                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]==0){
                        q.add(new int[]{nrow,ncol});
                        vis[nrow][ncol]=true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}