class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0)    low++;
        int count=0;
        
        while(low<=high){
            count++;
            low+=2;
        }
        return count;
    }
}