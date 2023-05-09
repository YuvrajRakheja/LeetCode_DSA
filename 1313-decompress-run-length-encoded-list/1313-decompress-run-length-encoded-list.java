class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[] ans =new int[size];
        int cnt=0;
        
        for(int i=0;i<nums.length-1;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            int idx=0;
            while(idx<freq){
                ans[cnt]=val;
                cnt++;
                idx++;
            }
        }
        
        return ans;

    }
}