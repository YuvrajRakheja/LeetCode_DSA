class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,n=arr.length;
        
        //increasing
        while(left<n-1 && arr[left+1]>arr[left]){
            left++;
        }
        return left;
        
    }
}