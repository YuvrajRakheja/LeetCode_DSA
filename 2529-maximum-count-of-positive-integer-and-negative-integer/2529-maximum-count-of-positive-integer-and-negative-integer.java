class Solution {
    public int maximumCount(int[] nums) {
        int cntpositive=0,cntnegative=0;
        
        for(int num:nums){
            if(num<0)   cntnegative++;
            else if(num>0)  cntpositive++;
        }
        return (int)Math.max(cntpositive,cntnegative);
    }
}