class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int left=0,right=n-1;
        
        while(left<n-1 && arr[left]<arr[left+1])    left++;
        while(right>0 && arr[right]<arr[right-1])   right--;
        
        if(left<n-1 && right>0 && left==right)  return true;
        else    return false;
    }
}