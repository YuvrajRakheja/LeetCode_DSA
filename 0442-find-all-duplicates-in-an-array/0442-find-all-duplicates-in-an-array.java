//TC-0(N)
//SC-0(1)
//OPTIMIZED
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            
            if(nums[idx]<0){
                ans.add(Math.abs(nums[i]));
            }else{
                nums[idx]*=-1;
            }
        }
        return ans;
    }
}