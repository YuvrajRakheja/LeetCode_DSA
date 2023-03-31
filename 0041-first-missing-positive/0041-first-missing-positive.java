//TC-0(NLOGN)
//SC-0(1)
//OPTIMIZED FORCE
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        
        while(i<nums.length && nums[i]<1 ){
            i++;
        }
        
        if(i==nums.length || nums[i]>1){
            return 1;
        }
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]>1){
                return nums[i]+1;
            }
            i++;
        }
        return nums[i]+1;
    }
}