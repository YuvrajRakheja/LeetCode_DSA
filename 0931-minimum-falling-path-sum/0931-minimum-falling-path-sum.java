//TC-0(N*N+N)
//SC-0(N)
//SPACE OPTIMIZATION
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        
        int[] prev=new int[n];
        int[] curr=new int[n];  
        
        for(int i=0;i<n;i++){
            prev[i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+prev[j];
                
                int upleft=matrix[i][j];
                if(j-1>=0){
                    upleft+=prev[j-1];
                }else{
                    upleft+=Math.pow(10,9);
                }
                
                int upright=matrix[i][j];
                if(j+1<matrix.length){
                    upright+=prev[j+1];
                }else{
                    upright+=Math.pow(10,9);
                }
                curr[j]=Math.min(up,Math.min(upleft,upright));
            }
            prev=curr;
            curr=new int[n];
        }
        int mini=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            mini=Math.min(mini,prev[i]);
        }
        return mini;
    }
}