//TC-0(M*N)
//SC-0(M)
//TABULATION SPACE OPTIMIZED
class Solution {
    public int uniquePaths(int m, int n) {
        int[] curr=new int[n];
        int[] prev=new int[n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    curr[j]=1;
                }else{
                    curr[j]=((i>0)?prev[j]:0)+((j>0)?curr[j-1]:0);
                }
            }
            prev=curr;
        }
        return prev[n-1];
    }
}