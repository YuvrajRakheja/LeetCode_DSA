class Solution {
    public int[] separateDigits(int[] nums) {
        int size=calcsize(nums);
        
        int[] ans=new int[size];
        int i=0;
        
        for(int val:nums){
            int s=calcnumssize(val);
            
            while(s>0){
                ans[i]=val/(int)Math.pow(10,s-1);
                val=val%(int)Math.pow(10,s-1);
                s--;
                i++;
            }
        }
        return ans;
    }
    public int calcsize(int[] nums){
        int size=0;
        for(int val:nums){
            while(val>0){
                size++;
                val/=10;
            }
        }
        return size;
    }
    public int calcnumssize(int val){
        int size=0;
        while(val>0){
            size++;
            val/=10;
        }
        return size;
    }
    
}