//TC-0(N)
//SC-0(N)
//SLIGHLY OPTIMIZED
class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr==null || arr.length==0)  return 0;
        
        int count=0;
        
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        
        right[right.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.min(right[i+1],arr[i]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            if(left[i]<=right[i+1])  count++;
        }
        return count+1;//+1 because last one is left always
    }
}