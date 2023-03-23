//BRUTE FORCE
//TC-0(N^2)
//SC-O(N)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(nums[0]);
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            int cnt=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>(nums.length/3)){
                    if(!ans.contains(nums[i])){
                        ans.add(nums[i]);
                    }
            }
        }
        return ans;
    }
}