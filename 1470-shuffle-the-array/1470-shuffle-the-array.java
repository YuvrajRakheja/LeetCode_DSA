class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int i=0,j=0;
        
        while(i<nums.length-1){
            ans[i++]=nums[j];
            ans[i++]=nums[j+n];
            j++;
        }
        return ans;
    }
}