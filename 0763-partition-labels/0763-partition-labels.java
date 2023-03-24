//TC-0(2N)
//SC-0(1)
class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s==null || s.length()==0)    return null;
        
        List<Integer> ans=new ArrayList<>();
        
        int[] lastindex=new int[26];
        
        for(int i=0;i<s.length();i++){
            lastindex[s.charAt(i)-'a']=i;//filling of impact of characters
        }
        
        int maxindx=0;
        int initial=0;
        
        //making of result
        for(int i=0;i<s.length();i++){
            maxindx=Math.max(lastindex[s.charAt(i)-'a'],maxindx);
            
            if(maxindx==i){
                ans.add(i-initial+1);
                initial=i+1;
            }
        }
        return ans;
    }
}