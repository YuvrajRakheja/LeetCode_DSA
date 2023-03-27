class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        
        while(i<j){
            char ch_i=s.charAt(i);
            char ch_j=s.charAt(j);
            
            if(ch_i==ch_j){
                i++;
                j--;
            }else{
                //skip one character at most either from right or left
                return isValid(s,i+1,j)||isValid(s,i,j-1);
            }
        }
        return true;
    }
    public boolean isValid(String str,int i,int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }else{
                i++;
                j--;   
            }
        }
        return true;
    }
}