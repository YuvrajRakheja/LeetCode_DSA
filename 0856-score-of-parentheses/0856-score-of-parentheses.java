class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //( pe push -1
            if(ch=='('){
                st.push(-1);
            }else{// ) hai
                if(st.peek()!=-1){
                    int vl=0;
                    while(st.peek()!=-1){
                        vl+=st.pop();
                    }
                    st.pop();//pop of -1 of )
                    st.push(2*vl);
                }else{
                    st.pop();
                    st.push(1);//normal wla case ( ) type
                }
            }
        }
        
        int val=0;
        while(st.size()>0){
            val+=st.pop();
        }
        return val;
    }
}