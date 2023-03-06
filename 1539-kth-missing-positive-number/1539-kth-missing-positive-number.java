class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1,idx=0;
        
        while(k>0){
            if(idx<arr.length){
                if(i!=arr[idx]){
                    k--;
                    if(k==0)    return i;
                }else{
                    idx++;
                }
                i++;    
            }else{
                k--;
                if(k==0)    return i;
                i++;                
            }
        }
        return i;
    }
}