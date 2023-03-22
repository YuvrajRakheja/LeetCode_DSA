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
        HashMap<Character,Character> map=new HashMap<>();//mapping word char and pattern chars
        HashSet<Character> set=new HashSet<>();//pattern ka hai
        
        
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            
            if(map.containsKey(w)){
                //pattern character already mapped
                if(map.get(w)!=p)   return false;
            }else{
                //pattern character is new for mapping
                if(set.contains(p)){
                    return false; //matlab new w ka jo p hai woh already hai toh condition violate.Dry run for word-abc  pattern-rpr
                }
                set.add(p);
                map.put(w,p);
            }
        }
        return true;
    }
}