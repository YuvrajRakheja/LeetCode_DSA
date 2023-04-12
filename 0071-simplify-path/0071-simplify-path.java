//TC-0(2N)
//SC-0(N)
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] pathlist=path.split("\\/");
        
        for(String p:pathlist){
            if(p.length()==0 || p.equals(".")){
                continue;
            }else if(p.equals("..")){
                if(st.size()>0) st.pop();
            }else{
                st.push(p);//string case
            }
        }
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
            sb.insert(0,"/");
        }
        if(sb.length()==0){
            return "/";
        }else{
            return sb.toString();
        }      
    }
}