class Solution {
    public int findPeakElement(int[] nums) {
        boolean flag=true;
        int i;
        
        for( i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                flag=false;
                continue;
            }
            if(flag==false) return i;            
        }
        return flag==false?i:0;
    }
}