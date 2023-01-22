class Solution {
    public int alternateDigitSum(int n) {
        String str=n+"";
        int ans=0;
        
        for(int i=0;i<str.length();i++){
            ans+=(i%2==0)?str.charAt(i)-'0':(-1)*(str.charAt(i)-'0');
        }
        return ans;
    }
}