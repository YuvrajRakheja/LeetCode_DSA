class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();

        if(nums.length==0)  return ans;
        int strt=nums[0];
        
        for(int i=1;i<nums.length;i++){
            String sans="";
            int diff=nums[i]-nums[i-1];
            
            if(Math.abs(diff)>1){
                if(strt!=nums[i-1]){
                    sans=strt+"->"+nums[i-1];
                }else{
                    sans=strt+"";   
                }
                strt=nums[i];
                ans.add(sans);
                
            }            
        }
        String sans="";
        if(strt!=nums[nums.length-1]){
                sans=strt+"->"+nums[nums.length-1];
        }else{
                sans=strt+"";   
        }
        
        ans.add(sans);        
        return ans;
    }
}