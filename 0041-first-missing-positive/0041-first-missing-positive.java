//TC-0(N)
//SC-0(1)
//OPTIMIZED 
class Solution {
    public int firstMissingPositive(int[] nums) {
        //1.Mark element which are out of range and manage presence of one
        boolean one=false;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                one=true;
            }
            if(nums[i]<1 ||nums[i]>n){
                nums[i]=1;
            }
        }
        if(one==false)  return 1;//matlab 1 is missing
        //2.Map elements with index
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i]);
            nums[idx-1]=-Math.abs(nums[idx-1]);
        }
        //3.Find out missing index
        for(int i=0;i<n;i++){
            if(nums[i]>0)   return i+1;
        }
        return n+1;
    }
}