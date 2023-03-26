//TC-0(N)
//SC-0(1)
//OPTIMIZED
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l=0,maxn=0,r=nums.length-1,minn=nums.length-1;
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxn]){
                maxn=i;
            }else if(nums[maxn]>nums[i]){
                l=i;
            }
            if(nums[n-1-i]<nums[minn]){
                minn=n-1-i;
            }else if(nums[n-1-i]>nums[minn]){
                r=n-1-i;
            }
        }
        if(l<=r){
            return 0;
        }
        return l-r+1;
    }
}