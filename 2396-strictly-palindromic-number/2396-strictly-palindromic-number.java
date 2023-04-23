class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i=2;i<=n-2;i++){
            String b=getbase(n,i);
            boolean ans=check(b);
            if(!ans)    return false;
        }
        return true;
    }
    public String getbase(int n,int bs){
        StringBuilder sb=new StringBuilder();
               
        while(n>0){
            int dig=n%bs;
            n=n/bs;
            //sb.append(dig);
            sb.insert(0,Integer.toString(dig));
        }
        return sb.toString();
    }
    public boolean check(String n){
        int left=0,right=n.length()-1;
        while(left<=right){
            if(n.charAt(left)==n.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}