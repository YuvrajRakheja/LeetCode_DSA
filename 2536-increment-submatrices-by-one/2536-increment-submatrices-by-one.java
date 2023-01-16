//TC-0(QUERIES*ROW)+0(ROW*COLUMN)=0(QUERIES*LENGTH)
//optimized
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans=new int[n][n];
        
        for(int i=0;i<queries.length;i++){//IT WILL RUN AT MAX 10^4*500
            int row_start=queries[i][0],row_end=queries[i][2];
            int col_start=queries[i][1],col_end=queries[i][3];
            
            for(int j=row_start;j<=row_end;j++){
                ans[j][col_start]+=1;
                if(col_end+1<ans[0].length) ans[j][col_end+1]-=1;
            }//here we have marked on exact match +1 and after it end -1 so that when we calculate prefix sum it is adjusted           
        }
        
        for(int i=0;i<ans.length;i++){//IT WILL RUN AT MAX 500*500
                for(int j=1;j<ans[0].length;j++){
                    ans[i][j]+=ans[i][j-1];
                }
        }
        return ans;
    }
}