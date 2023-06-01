//https://www.youtube.com/watch?v=1TDmgo1Sa2o
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftst=new Stack<>();//left ( store karega
        Stack<Integer> str=new Stack<>();// stores *
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                leftst.push(i);
            }else if(ch==')'){
                if(!leftst.isEmpty()){
                    leftst.pop();
                }else if(!str.isEmpty()){
                    str.pop();
                }else{
                    return false;
                }
            }else{// star hai
                str.push(i);
            }
        }
        //writing this case specially for case like (()* it will be leftst=0 and str=3
            
        while(!leftst.isEmpty() && !str.isEmpty()){
            int idx1=leftst.pop();
            int idx2=str.pop();
            
            if(idx1>idx2)   return false;
            //if leftst is greater than star means case like *()( so false
        }
        return leftst.isEmpty();
    }
}