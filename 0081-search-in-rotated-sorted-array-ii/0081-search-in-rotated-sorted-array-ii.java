//TC-0(N) WORST CASE WHEN ALL ELEMENTS ARE EQUAL BEST CASE IS LOGN NORMAL BINARY SEARCH
//SC-0(1)

class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
                
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)   return true; 
            
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){//IT IS SAME SEARCH IN ROTATED PART-1 EXCEPT THAT IT HAS REPEATING SO A CASE CAN COME LIKE 3,1,3,3,3 HERE NUMS OF MID,LOW,HIGH ARE ALL EQUAL SO SHRINK SEARCH AREA
                low++;
                high--;
                continue;
            }              
            
            if(nums[low]<=nums[mid]){//left is sorted
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{//right is sorted
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        
        return false;
    }
}