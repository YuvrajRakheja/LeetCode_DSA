//TC-0(LOGN)
//SC-0(1)
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)  return 0;
        
        if(nums[0]>nums[1]) return 0;//as we r finding mid+1 and mid-1 so to prevent problem arousing on edges we make this edge cases
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        
        int low=1;//as we have checked for first case
        int high=nums.length-2;//as we have checked for last case
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])  return mid;//mid index is peak
            else if(nums[mid]>nums[mid+1]){//peak on left side
                high=mid-1;
            }else if(nums[mid]<nums[mid+1]){//peak on right side
                low=mid+1;
            }
        }
        return -1;
    }
}
