class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        
        for(String t:tokens){
            if(isOperator(t)){
                int ele2=Integer.parseInt(st.pop());
                int ele1=Integer.parseInt(st.pop());
                int ans=0;
                if(t.equals("+")){
                    ans=ele1+ele2;
                }else if(t.equals("-")){
                    ans=ele1-ele2;
                }else if(t.equals("*")){
                    ans=ele1*ele2;
                }else{
                    ans=ele1/ele2;
                }
                st.push(ans+"");
            }else{
                st.push(t);//operand
            }
        }
        return Integer.parseInt(st.peek());
    }
    public boolean isOperator(String t){
        if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
            return true;
        }else{
            return false;
        }
    }
}