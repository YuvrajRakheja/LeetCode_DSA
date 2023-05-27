class Solution {
    public long maxStrength(int[] nums) {
        if(nums.length==1)    return nums[0];
        boolean flag=false;
        
        Arrays.sort(nums);
        
        long max=1;
        int i=nums.length-1;
        
        while(true){
            if(i>=0 && nums[i]>0)   max*=nums[i];
            else    break;
            i--;
            flag=true;
        }//taken positive max
        
        if(i==0)    return max;
        int j=0;
        
        while(j+2<=i+1 && nums[j+1]<0){
            max*=nums[j];
            j++;
            max*=nums[j];
            j++;
        }//taken negative too
        
        if(max==1 && nums.length>1 && !flag)  return 0;//means kuch nhi hua
        
        return max;
    }
}