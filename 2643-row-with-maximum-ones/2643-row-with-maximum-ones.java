class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rowindx=-1,nosof1=-1;
        
        for(int i=0;i<mat.length;i++){
            int counter=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    counter++;
                }
            }
            if(counter>nosof1){
                nosof1=counter;
                rowindx=i;
            }
        }
        return new int[]{rowindx,nosof1};
    }
}