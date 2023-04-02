//TC-0(MLOGM+Nlogm)
//SC-0(1)
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans=new int[spells.length];
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++){
            int left=0,high=potions.length-1;
            
            while(left<=high){
                int mid=left+(high-left)/2;
                
                if(1L*spells[i]*potions[mid]>=success){
                    high=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=potions.length-left;
        }
        return ans;
    }
}