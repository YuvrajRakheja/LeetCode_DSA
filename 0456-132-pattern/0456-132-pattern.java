//TC-0(N)
//SC-0(1)
//OPTIMIZED
//https://www.youtube.com/watch?v=yL8a7nnb8xw
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        //idea is that we find max of left i.e i and the current element is j and right to curret(i.e j) is k
        int secondmax=Integer.MIN_VALUE;//yeh k hai that is 
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<secondmax)   return true;
            
            while(st.size()>0 && nums[i]>st.peek()){
                secondmax=Math.max(st.pop(),secondmax);
            }
            st.push(nums[i]);
        }
        return false;
    }
}