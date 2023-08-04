class Solution {
    HashMap<String,Boolean> map=new HashMap<>();
    
    public boolean wordBreak(String str, List<String> wordDict) {
        if(wordDict.contains(str)){
            return true;
        }
        if(map.containsKey(str)){
            return map.get(str);
        }
        for(int i=0;i<str.length();i++){
            String possible=str.substring(0,i+1);
            String ros=str.substring(i+1);
            
            if(wordDict.contains(possible) && wordBreak(ros,wordDict)){
                map.put(str,true);
                return true; 
            }
        }
        map.put(str,false);
        return false;
    }
}