//TC-0(LOGN)
//SC-0(1)
//BINARY SEARCH

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length==1)    return 0;
        
        if(arr[0]>arr[1])   return 1;
        if(arr[arr.length-2]<arr[arr.length-1])    return arr.length-1;
        
        int low=1,high=arr.length-2;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}