class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)    return true;
        
        char ch=word.charAt(0);
        
        return isLower(word)||isUpper(word)||(ch>='A' && ch<='Z' && isLower(word.substring(1)));
    }
    public boolean isLower(String word){
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean isUpper(String word){
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
                                              
}