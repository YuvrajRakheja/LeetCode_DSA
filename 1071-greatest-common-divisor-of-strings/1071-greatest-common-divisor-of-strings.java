class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    public int gcd(int s1,int s2){
        while(s2!=0){
            int rem=s1%s2;
            s1=s2;
            s2=rem;
        }
        return s1;
    }
}