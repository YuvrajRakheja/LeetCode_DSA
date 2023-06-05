//TC-0(N)
//SC-0(1)
class Solution {
    public boolean canJump(int[] nums) {
        int lastindex=nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=lastindex){
                lastindex=i;
            }
        }
        return lastindex==0;
    }
}