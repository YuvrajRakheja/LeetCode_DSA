class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)  return strs[0];
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            min=Math.min(min,strs[i].length());
        }
        int idx=min;
        boolean flag=false;
        
        for(int i=0;i<min;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    idx=i;
                    flag=true;
                    break;
                }
            }
            if(flag)    break;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<idx;i++){
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
}