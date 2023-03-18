class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=0;
        
        while(low+1<nums.length && nums[low]<=nums[low+1]){//finding right where order gets distorted
            low++;
        }
        int high=nums.length-1;
        
        while(high-1>=0 && nums[high]>=nums[high-1]){//finding right where order gets distorted
            high--;
        }
        
        if(low==nums.length-1)  return 0;//agar already sorted toh answer 0 hoga
        
        int wmin=Integer.MAX_VALUE;
        int wmax=Integer.MIN_VALUE;
        
        for(int i=low;i<=high;i++){
            wmin=Math.min(wmin,nums[i]);
            wmax=Math.max(wmax,nums[i]);
        }//humne potential subarray ka min aur max nikala hai
        
        while(low-1>=0 && nums[low-1]>wmin){
            low--;
        }
        while(high+1<nums.length && nums[high+1]<wmax){
            high++;
        }
        return high-low+1;
    }
}