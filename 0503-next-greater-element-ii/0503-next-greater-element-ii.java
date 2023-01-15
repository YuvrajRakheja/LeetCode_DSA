//TC-0(N)
//SC-0(N)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[nums.length];
        int n=nums.length;
        
        //ASSUME WE ARE PUTTING NUMS ARRAY IN FRONT OF NUMS SO IT CAN BE THOUGHT CIRCULAR
        for(int i=2*n-1;i>=0;i--){
            while(st.size()>0 && nums[i%n]>=st.peek()){
                st.pop();
            }
            if(i<n){
                nge[i]=(st.size()>0)?st.peek():-1;
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}