//redo
class Solution {
    public int jump(int[] nums) {
        int result = 0, n = nums.length;
        int end = 0, far = 0;
        for(int i = 0; i < n - 1; i++){
            far = Math.max(far, i + nums[i]);
            if(i == end){
                result++;
                end = far;
            }
        }
        return result;
    }
}
