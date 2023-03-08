class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ans=new int[k];
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            //valid-->remaining >= requirement
            //requirement-->k-st.size();
            //remaining-->n-(i+1)
            
            while(!st.isEmpty() && st.peek()>nums[i] && n-i-1>=k-st.size()){
                st.pop();
            }
            if(st.size()<k){
                st.push(nums[i]);
            }
        }
        int i=k-1;
        
        while(i>=0) ans[i--]=st.pop();
        
        return ans;
    }
}