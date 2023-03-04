class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st=new Stack<>();
        char[] str=s.toCharArray();
        
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                st.push(i);
            }else if(str[i]==')'){
                if(st.size()==0){
                    str[i]='.';
                }else{//pair hai matlab st me ( hoga
                    st.pop();
                }
            }
        }
        while(st.size()>0){
            str[st.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(str[i]!='.'){
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }
}