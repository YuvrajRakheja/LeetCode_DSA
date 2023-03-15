//TC-0(N)
//SC-0(N)
//BRUTE
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        
        int count=0;
        
        left[0]= arr[0];
        for(int i=1;i<left.length;i++){//left maximum
            left[i]=Math.max(left[i-1],arr[i]);
        }
        
        right[right.length-1]=arr[arr.length-1];
        for(int i=right.length-2;i>=0;i--){//right minimum
            right[i]=Math.min(right[i+1],arr[i]);
        }
        
        for(int i=0;i<arr.length-1;i++){
            if(left[i]<=right[i+1])  count++;
        }
        return count+1;
    }
}