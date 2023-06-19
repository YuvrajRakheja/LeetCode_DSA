//TC-0(N)
//SC-0(1)
class Solution {
    public int largestAltitude(int[] gain) {
       int alt=0,maxalt=0;
        
        for(int i=0;i<gain.length;i++){
            alt+=gain[i];
            maxalt=Math.max(alt,maxalt);
        }
        return maxalt;
    }
}