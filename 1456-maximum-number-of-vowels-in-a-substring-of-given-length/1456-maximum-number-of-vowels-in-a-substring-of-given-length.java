//TC-0(N)
//SC-0(1)
//SLIDING WINDOW
class Solution {
    public int maxVowels(String s, int k) {
        
        if (s == null | s.length() < 1 || k < 1) return -1;

        int max=0;
        int ans=0;
        Set<Character> set=Set.of('a','e','i','o','u');
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i>=k && set.contains(s.charAt(i-k))){
                ans--;
            }
            
            if(set.contains(ch)){
                ans++;
            }
            max=Math.max(ans,max);
        }
        return max;
    }
}
 