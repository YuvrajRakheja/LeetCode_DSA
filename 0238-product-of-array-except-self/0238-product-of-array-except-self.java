//TC-0(N)
//SC-0(2N)
//BRUTE
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right=new int[nums.length];
        int[] left=new int[nums.length];
        
        int[] ans=new int[nums.length];
        
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*nums[i-1]; 
        }//for i index element finding multiplication of all i-1 elements
        
        right[nums.length-1]=1;
        for(int i=right.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1]; 
        }//for i index element finding multiplication of all i+1 elements
        
        for(int i=0;i<ans.length;i++){
            ans[i]=left[i]*right[i];
        }
        
        return ans;
    }
}