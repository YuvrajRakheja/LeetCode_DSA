class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int row=1;row<=numRows;row++){
            List<Integer> sans=generaterow(row);
            ans.add(sans);
        }
       return ans;       
    }
    public List generaterow(int row){
        List<Integer> ans=new ArrayList<>();
        int temp=1;
        ans.add(temp);
        
        for(int col=1;col<row;col++){
            temp*=(row-col);
            temp/=col;
            ans.add(temp);
        }
        return ans;
    }
}
//Time complexity 0(n2)
//Space complexity 0(1)
//optimal