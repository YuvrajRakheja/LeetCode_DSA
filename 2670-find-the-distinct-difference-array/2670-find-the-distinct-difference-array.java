class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer,Integer> before=new HashMap<>();
        HashMap<Integer,Integer> after=new HashMap<>();
        
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            after.put(nums[i],after.getOrDefault(nums[i],0)+1);//for first index
        }
        
        for(int i=0;i<nums.length;i++){           
            before.put(nums[i],before.getOrDefault(nums[i],0)+1);
            after.put(nums[i],after.getOrDefault(nums[i],0)-1);
            
            if(after.get(nums[i])==0){
                after.remove(nums[i]);
            }
            ans[i]=before.size()-after.size();
        }
        return ans;
    }
}