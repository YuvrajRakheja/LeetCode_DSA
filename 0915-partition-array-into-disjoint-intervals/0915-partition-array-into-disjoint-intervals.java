//TC-0(2N)
//SC-0(N)
class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] rightmin=new int[nums.length+1];
        
        rightmin[nums.length]=Integer.MAX_VALUE;
        
        for(int i=nums.length-1;i>=0;i--){
            rightmin[i]=Math.min(nums[i],rightmin[i+1]);
        }
        
        int leftmax=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            leftmax=Math.max(nums[i],leftmax);
            
            if(leftmax<=rightmin[i+1]){
                ans=i;
                break;
            }
        }
        return ans+1;//ans+1 beacsue hum right ka first index return kr rhe hai
    }
}