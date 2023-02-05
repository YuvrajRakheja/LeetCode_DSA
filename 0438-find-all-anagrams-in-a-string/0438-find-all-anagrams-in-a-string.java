class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        
        if(s.length()<p.length())   return ans;
        
        int[] ss=new int[26];
        int[] pp=new int[26];
        
        int i=0,j=0;
        
        for(int k=0;k<p.length();k++){
            pp[p.charAt(k)-'a']++;
        }
        
        while(j<s.length()){
            ss[s.charAt(j)-'a']++;
            
            if(j-i+1==p.length()){
                if(Arrays.equals(ss,pp)){
                    ans.add(i);
                }
            }
            
            if(j-i+1<p.length()){
                j++;
            }else{
                ss[s.charAt(i)-'a']--;
                i++;
                j++;
            }
        }      
        return ans;
    }
}