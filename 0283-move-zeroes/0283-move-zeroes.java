class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;        

        int i=0,j=0;
        
        while(i<nums.length){
            if(nums[i]==0){
                i++;
            }else{
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                
                i++;
                j++;
            }
        }
    }
}