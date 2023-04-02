//TC-0(N)
//SC-0(N)
class Solution {
    public int waysToMakeFair(int[] nums) {
        int[] odd=new int[nums.length];
        int[] even=new int[nums.length];
        
        int oddsum=0,evensum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                evensum+=nums[i];
            }else{
                oddsum+=nums[i];
            }
            odd[i]=oddsum;
            even[i]=evensum;
        }
        
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(i==0){//matlab 0th index remove kiya hai
                int nos=even[nums.length-1]-nums[0];//sum of odds after removing 0th index
                int nes=odd[nums.length-1];//sum of even 
                if(nos==nes){
                    count++;            
                }
                continue;
            }    
            int noo=odd[i-1]+(even[nums.length-1]-even[i]);//sum of odds when any index is removed ith index ke pehle odds and ith index ke baad ke even odds ban jate hai
            int noe=even[i-1]+(odd[nums.length-1]-odd[i]);//sum of even when any index is removed ith index ke pehle even and ith index ke baad ke odd even ban jate hai
            
            if(noo==noe){
                count++;
            }
        }
        return count;
    }
}