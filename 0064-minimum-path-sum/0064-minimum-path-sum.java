//TC-0(M*N) 
//SC-0(M) DP SPACE
//Tabulation Space Optimized
class Solution {
    public int minPathSum(int[][] grid) {
        int[] curr=new int[grid[0].length];
        int[] prev=new int[grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    curr[j]=grid[0][0];
                }else{
                    int right=grid[i][j];
                    if(j>0){
                        right+=curr[j-1];
                    }else{//negative base cases
                        right+=(int)Math.pow(10,9);
                    }
                    
                    int down=grid[i][j];
                    if(i>0){
                        down+=prev[j];
                    }else{//negative base cases
                        down+=(int)Math.pow(10,9);
                    }
                    curr[j]=Math.min(right,down);
                }
            }
            prev=curr;
        }
        return prev[grid[0].length-1];
    }
}