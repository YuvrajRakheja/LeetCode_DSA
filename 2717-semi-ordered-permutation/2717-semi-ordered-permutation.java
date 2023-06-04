class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int first=0,last=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)  first=i;
            if(nums[i]==nums.length)    last=i;
        }
        int ans= first + (nums.length-1-last) - (first > last ? 1 : 0);

        return ans;
    }
}