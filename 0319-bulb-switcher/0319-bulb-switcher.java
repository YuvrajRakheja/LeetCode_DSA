class Solution {
    public int bulbSwitch(int n) {
        //only perfect squares are on after n round.Same as toggle switch pepcoding
        int count=0;
        
        for(int i=1;i*i<=n;i++){
            count++;
        }
        return count;
    }
}