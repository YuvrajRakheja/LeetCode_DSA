class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int row=1;row<=numRows;row++){
            List<Integer> sans=new ArrayList<>();
            for(int col=1;col<=row;col++){
                sans.add(ncr(row-1,col-1));
            }
            ans.add(sans);
        }
       return ans;       
    }
    public int ncr(int n,int r){
        int ans=1;
        for(int i=0;i<r;i++){
            ans*=(n-i);
            ans/=(i+1);
        }
        return ans;
    }
}
//Time complexity 0(n3)
//Space complexity 0(1)