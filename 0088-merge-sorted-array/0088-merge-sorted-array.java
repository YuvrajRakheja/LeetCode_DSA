//TC-0((N+M)*(LOG(N+M))
//SC-0(1)
//OPTIMIZED USING GAP METHOD which is based on SHELL SORT
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        int gap=(len/2)+(len%2);
        
        while(gap>0){
            int left=0;
            int right=gap;
            
            while(right<len){//bcs right hi pehle touch karega
                if(left<m && right>=m){//left in arr1 and right in arr2
                    swapifgreater(nums1,nums2,left,right-m);
                }else if(right<m){//both in arr1
                    swapifgreater(nums1,nums1,left,right);
                }else{//both in arr2
                    swapifgreater(nums2,nums2,left-m,right-m);
                }
                left++;
                right++;
            }
            if(gap==1)  break;
            gap=gap/2+(gap%2);
        }
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
    }
    public void swapifgreater(int[] nums1,int[] nums2,int left,int right){
        if(nums1[left]>nums2[right]){
            int temp=nums1[left];
            nums1[left]=nums2[right];
            nums2[right]=temp;
        }
    }
}