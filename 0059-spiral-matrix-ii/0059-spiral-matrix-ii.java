class Solution {
    public int[][] generateMatrix(int n) {
        int idx=1;
        int count=n*n;
        int[][] ans=new int[n][n];
        int minr=0,maxr=n-1,minc=0,maxc=n-1;
        
        while(idx<=count){
            for(int i=minc;i<=maxc && idx<=count;i++){
                ans[minr][i]=idx;
                idx++;
            }
            minr++;
            
            for(int i=minr;i<=maxr && idx<=count;i++){
                ans[i][maxc]=idx;
                idx++;
            }
            maxc--;
            
            for(int i=maxc;i>=minc && idx<=count;i--){
                ans[maxr][i]=idx;
                idx++;
            }
            maxr--;
            
            for(int i=maxr;i>=minr && idx<=count;i--){
                ans[i][minc]=idx;
                idx++;
            }
            minc++;
        }
        return ans;
    }
}