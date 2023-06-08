class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int r=grid.length-1,c=0;
        
        while(r>=0 && c<grid[0].length){
            if(grid[r][c]<0){
                r--;
                cnt+=grid[0].length-c;// there are n - c negative numbers in current row.
            }else{
                c++;
            }
        }
        return cnt;
    }
}