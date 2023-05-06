class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=(int)Math.pow(10,9)+7;
        
        int[] freq=new int[nums.length];
        freq[0]=1;
        for(int i=1;i<nums.length;i++){
            freq[i]=(2*freq[i-1])%mod;
        }
        
        Arrays.sort(nums);
        
        int left=0,right=nums.length-1;//2 pointer
        int res=0;
        
        while(left<=right){
            if(nums[left]+nums[right]>target){
                right--;
            }else{
                res=(res+(freq[right-left]%mod))%mod;
                left++;
            }
        }
        return res;
    }
}