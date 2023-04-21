class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans=new int[grid[0].length];
        
        for(int j=0;j<grid[0].length;j++){
            int len=0;
            for(int i=0;i<grid.length;i++){
                int curlen=getlen(grid[i][j]);
                len=Math.max(curlen,len);
            }
            ans[j]=len;
        }
        return ans;
    }
    public int getlen(int ele){
        int l=0;
        if(ele<0){
            l++;
            ele=ele*-1;
        }
        if(ele==0)  return 1;
        while(ele>0){
            ele=ele/10;
            l++;
        }
        return l;
    }
}