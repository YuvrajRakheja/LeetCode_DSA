//TC-0(n*n)
//SC-0(n*n)
//Space Optimization

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] curr=new int[nums.length+1];
        int[] after=new int[nums.length+1];
        
        for(int i=0;i<nums.length+1;i++){//idx array
            after[i]=0;//idx=nums.length    
        }
        
        for(int i=nums.length-1;i>=0;i--){
            for(int prev_idx=i-1;prev_idx>=-1;prev_idx--){
                int nottake=0+after[prev_idx+1];
                
                int take=0;
                if(prev_idx==-1||nums[i]>nums[prev_idx]){
                    take=1+after[i+1];
                }
                
                curr[prev_idx+1]=Math.max(take,nottake);
            }
            after=(int[])curr.clone();
        }
        return after[0];
    }
}