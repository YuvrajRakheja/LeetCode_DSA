//TC-0(N)
//SC-0(N)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge=new int[nums.length];
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && nums[i]>=st.peek()){
                st.pop();
            }
            st.push(nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek()){
                st.pop();
            }
            
            nge[i]=(st.size()>0)?st.peek():-1;
            
            st.push(nums[i]);
        }
        return nge;
    }
}