//TC-0(N)
//SC-0(1)
//OPTIMIZED
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max_till_now=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            
            max_till_now=Math.max(max_till_now,arr[i]);
                
            if(i==max_till_now) count++;
        }
        return count;
    }
}