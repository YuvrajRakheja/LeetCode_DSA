class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-1;i++){
            diff=Math.min(nums[i+1]-nums[i],diff);
        }
        return diff;
    }
}