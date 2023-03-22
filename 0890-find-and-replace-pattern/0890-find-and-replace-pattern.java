class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        
        for(String word:words){
            if(isMatching(word,pattern)){
                ans.add(word);
            }
        }
        return ans;
    }
    public boolean isMatching(String word,String pattern){
        for(int i=0;i<word.length();i++){
            if(word.indexOf(word.charAt(i))!=pattern.indexOf(pattern.charAt(i))){//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.So visualize dry run for word-xyy pattern-abb   word me x-1,y-2 and pattern me a-1,b-2
                return false;
            }
        }
        return true;
    }
}