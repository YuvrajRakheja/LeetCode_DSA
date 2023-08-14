//TC-0(NLOGN)
//SC-0(LOGN)In Java, Arrays.sort() for primitives is implemented using a variant of the Quick Sort algorithm, which has a space complexity of LOGN
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        
        return nums[nums.length-k];
    }
}