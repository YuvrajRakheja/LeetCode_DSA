//Optimized
class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0;
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                cnt+=1;
            }else{
                if(cnt>0){
                    cnt-=1;
                }else{
                    ans++;
                }
            }
        }
        return cnt+ans;
    }
}