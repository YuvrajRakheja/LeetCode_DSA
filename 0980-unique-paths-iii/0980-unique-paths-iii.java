class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zero=0;//count of zeros 
        int sx=0,sy=0;//starting x,y
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    zero++;//count increment of zeroes
                }else if(grid[i][j]==1){
                    sx=i;//starting x
                    sy=j;//starting y
                }
            }
        }
        return path(grid,sx,sy,zero);
    }
     private int path(int[][] grid, int x, int y, int zero){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1)
           return 0;
        if(grid[x][y] == 2)
           return zero == -1 ? 1 : 0;
        grid[x][y] = -1;
        zero--;
        int totalCount = path(grid, x + 1, y, zero) + path(grid, x, y + 1, zero) +
                         path(grid, x - 1, y, zero) + path(grid, x, y - 1, zero);
        grid[x][y] = 0;
        zero++;

        return totalCount;
    }
}
