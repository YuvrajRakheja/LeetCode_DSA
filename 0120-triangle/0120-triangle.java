//TC-0(N*N) 
//SC-0(N) 
//SPACE OPTIMIZED 
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int row=triangle.size(),col=triangle.size();
        
        int[] front=new int[col];
        int[] curr=new int[col];
        
        for(int j=0;j<col;j++){
            front[j]=triangle.get(row-1).get(j);
        }
        for(int i=row-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+front[j];
                int down_right=triangle.get(i).get(j)+front[j+1];
                
                curr[j]=Math.min(down,down_right);
            }
            front=curr;
            curr=new int[col];
        }
        return front[0];
    }
}