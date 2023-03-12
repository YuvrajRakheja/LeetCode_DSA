//TC-0(N)
//SC-0(N)

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<>();
        
        int[] freq=new int[26];
        boolean[] visited=new boolean[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;            
        }
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            freq[ch-'a']--;
            
            if(visited[ch-'a'])   continue;
            
            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0){
                char element=st.pop();
                visited[element-'a']=false;
            }
            st.push(ch);
            visited[ch-'a']=true;
        }
        
        int d=st.size()-1;
        char[] ans=new char[st.size()];
        
        while(d>=0)   ans[d--]=st.pop();
        
        return new String(ans);
        
    }
}