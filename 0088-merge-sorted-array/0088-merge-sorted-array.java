//TC-0(MLOGN+NLOGN)+O(min(m,n))
//SC-0(1)
//OPTIMIZED 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1,right=0;
        
        while(left>=0 && right<n){
            if(nums1[left]>nums2[right]){
                swap(nums1,left,nums2,right);
                left--;
                right++;
            }else{
                break;
            }
        }
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
    public void swap(int[] num1,int left,int[] num2,int right){
        int temp=num1[left];
        num1[left]=num2[right];
        num2[right]=temp;
    }
}