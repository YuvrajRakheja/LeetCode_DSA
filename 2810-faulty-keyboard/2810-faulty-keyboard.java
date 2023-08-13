class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='i'){
                sb=reverse(sb);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public StringBuilder reverse(StringBuilder sb){
        StringBuilder ans=new StringBuilder();
        
        int len=sb.length();
        
        for(int i=len-1;i>=0;i--){
            ans.append(sb.charAt(i));
        }
        return ans;
    }
}