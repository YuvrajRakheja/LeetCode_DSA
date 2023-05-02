class Solution {
    public int arraySign(int[] nums) {
        int zero=0,negatives=0;
        for(int val:nums){
            if(val==0)  zero++;
            if(val<0)   negatives++;
        }
        
        if(zero>0)  return 0;
        else if(negatives%2==1) return -1;
        else    return 1;
    }
}