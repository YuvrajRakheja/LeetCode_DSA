class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int []increasing=new int[nums.length];
        int []decreasing=new int[nums.length];
        Arrays.fill(increasing,1);
        Arrays.fill(decreasing,1);
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && increasing[i]<increasing[j]+1){
                    increasing[i]=increasing[j]+1;//lcs from left
                }
            }
        }
        
        for(int i=nums.length-2;i>=0;i--){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]>nums[j] && decreasing[i]<decreasing[j]+1){
                    decreasing[i]=decreasing[j]+1;//lcs from right
                }
            }
        }
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(increasing[i]>1 && decreasing[i]>1){
                max=Math.max(max,increasing[i]+decreasing[i]-1);   
            }
        }
        
        return nums.length-max;
    }
}