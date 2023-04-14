//TC-0(N)
//SC-0(1)
//Space Optimization
class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int prev=nums[0],prev2=0;
        
        for(int i=1;i<nums.length;i++){
            int take=nums[i]+((i>1)?prev2:0);
            int nottake=0+prev;
            
            int curr=Math.max(take,nottake);
            
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}