class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        while(i<letters.length){
            if(letters[i]>target)   return letters[i];
            i++;
        }
        return letters[0];
    }
}