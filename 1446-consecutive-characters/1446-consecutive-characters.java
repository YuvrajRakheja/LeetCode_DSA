class Solution {
    public int maxPower(String s) {
        int ans=1,count=1;
        char prev=s.charAt(0);
        
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==prev){
                count++;
                ans=Math.max(ans,count);
            }else{
                prev=ch;
                count=1;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}