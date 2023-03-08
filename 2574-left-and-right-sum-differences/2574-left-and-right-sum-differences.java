class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        
        int[] ans=new int[nums.length];
        
        for(int i=1;i<nums.length;i++){
            leftsum[i]+=nums[i-1]+leftsum[i-1];
            
            int j=nums.length-1-i;
            rightsum[j]+=nums[j+1]+rightsum[j+1];
        }
        
        for(int i=0;i<nums.length;i++){
            ans[i]=(int)Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}