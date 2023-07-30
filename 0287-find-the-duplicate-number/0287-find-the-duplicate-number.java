//TC-0(N)
//SC-0(N)
//SLIGHTLY OPTIMIZED FORCE
class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq=new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(freq[n]==0){
                freq[n]++;
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}