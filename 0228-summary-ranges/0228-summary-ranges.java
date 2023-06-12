class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            j=i;
            while(j<nums.length-1 && nums[j+1]==nums[j]+1){
                j++;
            }
            if(j>i){
                ans.add(nums[i]+"->"+nums[j]);
            }else{
                ans.add(nums[i]+"");
            }
            i=j;
        }
        return ans;
    }
}