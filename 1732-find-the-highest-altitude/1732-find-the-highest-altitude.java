class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt=new int[gain.length+1];
        
        for(int i=1;i<alt.length;i++){
            alt[i]=alt[i-1]+gain[i-1];
        }
        Arrays.sort(alt);
        return alt[alt.length-1];
    }
}