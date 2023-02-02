class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];
            
            int min=Math.min(word1.length(),word2.length());
            
            for(int j=0;j<min;j++){
                if(map.get(word1.charAt(j))<map.get(word2.charAt(j))){//it means second word first char is lexographically greater so fine
                    break;
                }
                if(map.get(word1.charAt(j))>map.get(word2.charAt(j))){
                    return false;//it means first word first char bada hai
                }
                
                if(j==min-1 && word1.length()>word2.length()){//last character of word and first word is greater in length so remaining
                    return false;
                }
            }
        }
        return true;
    }
}