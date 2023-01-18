//TC-0(N)
//SC-0(1)
//https://www.youtube.com/watch?v=k1erTVrGMnE
//WE NOT USE KADANE HERE AS NUMBERS IN GIVEN CONSTRAINT ARE NEGATIVE TOO AND KADANE WORKS IF MINIMUM 1 ELEMENT IS POSITIVE
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum=0;
        int curr_max=0,max_sum=nums[0];
        int curr_min=0,min_sum=nums[0];
        
        for(int ele:nums){
            //for calculating maximum value of maximum subarray
            curr_max=Math.max(curr_max+ele,ele);
            max_sum=Math.max(max_sum,curr_max);
            
            //for calculating minimum value of minimum subarray
            curr_min=Math.min(curr_min+ele,ele);
            min_sum=Math.min(curr_min,min_sum);
            
            total_sum+=ele;
        }
        return (max_sum)>0?Math.max(max_sum,total_sum-min_sum):max_sum;
    }
}