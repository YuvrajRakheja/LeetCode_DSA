class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        int i=0,j=s.length()-1;
        
        while(i<j){
            char ch_i=s.charAt(i);
            char ch_j=s.charAt(j);
            
            if(!Character.isLetterOrDigit(ch_i)){
                i++;
            }else if(!Character.isLetterOrDigit(ch_j)){
                j--;
            }else{
                if(Character.toLowerCase(ch_i)!=Character.toLowerCase(ch_j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}