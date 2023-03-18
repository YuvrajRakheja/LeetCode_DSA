//TC-0(N)
//SC-0(1)
//DO WITH LOWER COMPLEXITY
class Solution {
    public void wiggleSort(int[] nums) {
        int[] ans=new int[nums.length];
        
        Arrays.sort(nums);
        int i=1;
        
        //first fill at odd places odd places indices nums are bigger so fill from last
        int j=nums.length-1;
        
        while(i<nums.length){
            ans[i]=nums[j];
            i+=2;//for alternate odd places 
            j--;
        }
        i=0;
        
        while(i<nums.length){
            ans[i]=nums[j];
            i+=2;
            j--;
        }
        for(i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}