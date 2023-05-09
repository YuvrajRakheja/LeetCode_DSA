class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count=matrix.length*matrix[0].length;
        int idx=0;
        int minr=0,minc=0,maxr=matrix.length-1,maxc=matrix[0].length-1;
        List<Integer> ans=new ArrayList<>();
        
        while(idx<count){
            for(int i=minc;i<=maxc && idx<count;i++){
                ans.add(matrix[minr][i]);
                idx++;
            }    
            minr++;
            
            for(int i=minr;i<=maxr && idx<count;i++){
                ans.add(matrix[i][maxc]);
                idx++;
            }
            maxc--;
            
            for(int i=maxc;i>=minc && idx<count;i--){
                ans.add(matrix[maxr][i]);
                idx++;
            }
            maxr--;
            
            for(int i=maxr;i>=minr && idx<count;i--){
                ans.add(matrix[i][minc]);
                idx++;
            }
            minc++;
        }
        return ans;
    }
}