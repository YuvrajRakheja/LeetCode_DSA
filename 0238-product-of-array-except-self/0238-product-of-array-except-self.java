//TC-0(N)
//SC-0(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int prd=1;
        
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            prd*=nums[i-1];
            res[i]=prd;
        }//indirectly calculating left product of i-1 elements for ith index
        
        prd=1;
        
        for(int i=nums.length-2;i>=0;i--){
            prd*=nums[i+1];//indirectly calculating right product
            res[i]*=prd;
        }
        return res;
    }
}