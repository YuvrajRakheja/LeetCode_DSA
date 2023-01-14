//TC-0(N+M)
//SC-0(M) M IS 

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge=ngtr(nums2);//it contains answer for entire nums2

        HashMap<Integer,Integer> map=new HashMap<>();
        
        //first is number and second integer is its next greater element
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],nge[i]);
        }
        
        int[] ans=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        
        return ans;
    }
    public int[] ngtr(int[] nums){
        Stack<Integer> st=new Stack<>();
        
        int[] nge=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()){
                st.pop();//remove
            }
            if(st.isEmpty()){//print
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(nums[i]);//add
        }
        return nge;
    }
}