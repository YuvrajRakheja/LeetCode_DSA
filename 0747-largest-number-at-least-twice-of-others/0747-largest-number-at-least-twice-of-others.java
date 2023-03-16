class Solution {
    public int dominantIndex(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int idx_of_lrgst=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
                idx_of_lrgst=i;
                
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return (max1>=2*max2)?idx_of_lrgst:-1;
    }
}