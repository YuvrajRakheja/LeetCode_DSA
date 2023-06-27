class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            set.add(words[i]);
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isReverse(words[i],set) && notsame(words[i])){
                count++;
            }
        }
        return count;
    }
    public boolean isReverse(String word,Set<String> set){
        StringBuilder sb=new StringBuilder();
        
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        if(!set.contains(sb.toString())) return false;
        set.remove(word);
        set.remove(sb.toString());
        
        return true;
    }
    public boolean notsame(String word){
        char ch=word.charAt(0);
        
        for(int i=1;i<word.length();i++){
            if(ch!=word.charAt(i))  return true;
        }
        return false;
    }
}