class Solution {
    public int diagonalSum(int[][] mat) {
        int tot_sum=0;
                
        for(int i=0;i<mat.length;i++){
            tot_sum+=mat[i][i]+mat[i][mat.length-1-i];
        }       
        if(mat.length%2!=0) tot_sum-=mat[mat.length/2][mat[0].length/2];
        
        return tot_sum;
    }
}