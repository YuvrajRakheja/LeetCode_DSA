class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans=new int[n][n];
        
        for(int i=0;i<queries.length;i++){
            int strt_row=queries[i][0];
            int strt_col=queries[i][1];
            int end_row=queries[i][2];
            int end_col=queries[i][3];
            
            for(int j=strt_row;j<=end_row;j++){
                for(int k=strt_col;k<=end_col;k++){
                    ans[j][k]++;
                }
            }
        }
        return ans;
    }
}