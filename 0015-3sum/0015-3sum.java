//TC-0(N^2)
//SC-0(1)//NO AUXILIIARY SPACE
//Optimized
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){//skip duplicate i
                int left=i+1,right=nums.length-1;
               
                while(left<right){
                     int sum=nums[i]+nums[left]+nums[right];

                     if(sum==0){
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;//skip duplicate left
                        while(left<right && nums[right-1]==nums[right])   right--;//skip duplicate right
                        
                        left++;
                        right--;
                        
                    }else if(sum<0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}