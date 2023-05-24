class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<command.length();i++){
            char curr=command.charAt(i);
            
            if(curr=='G'){
                sb.append('G');
            }
            if(curr=='('){
                if(command.charAt(i+1)==')'){
                    sb.append('o');
                    i++;//to skip for )
                }else{
                    sb.append("al");
                    i+=3;//to skip al)
            }
            }
        }
        return sb.toString();
    }
}
