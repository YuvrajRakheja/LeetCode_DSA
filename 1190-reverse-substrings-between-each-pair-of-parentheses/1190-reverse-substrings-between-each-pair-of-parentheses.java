//can be optimized
//tc-0(n^2)

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch==')'){
                Queue<Character> q=new LinkedList<>();
                
                while(st.peek()!='('){//no need to worry about parenthesis it is givrn that it is balanced
                    q.add(st.pop());    
                }
                st.pop();
                
                while(q.size()>0){
                    st.push(q.remove());//reversed back in stack
                }
            }else{
                st.push(ch);// for (
            }
        }
        char[] ans=new char[st.size()];
        int i=ans.length-1;
        while(i>=0){
            ans[i--]=st.pop();
        }
        return new String(ans);
    }
}