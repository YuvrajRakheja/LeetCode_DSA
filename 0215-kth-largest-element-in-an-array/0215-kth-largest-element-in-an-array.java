//TC
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0,i=0;
        
        for(i=nums.length-1;i>=0;i--){
            count++;
            if(k==count){
                break;
            }
        }
        return nums[i];
    }
}