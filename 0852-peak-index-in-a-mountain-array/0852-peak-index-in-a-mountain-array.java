class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return i;
            }
            i++;
        }
        return -1;
    }
}