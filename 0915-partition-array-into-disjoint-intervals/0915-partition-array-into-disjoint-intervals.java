//TC-0(N)
//SC-0(1)

class Solution {
    public int partitionDisjoint(int[] nums) {
        int greater=nums[0],leftmax=nums[0];
        int idx=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>greater){
                greater=nums[i];
            }else if(nums[i]<leftmax){
                idx=i;//matlab pakka hai ki yeh include hoga
                leftmax=greater;
            }
        }
        return idx+1;        
    }
}