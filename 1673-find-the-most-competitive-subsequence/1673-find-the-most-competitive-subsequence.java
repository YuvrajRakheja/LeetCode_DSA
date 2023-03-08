//SIMILIAR TO LC 402
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        return removekdigits(nums,nums.length-k);//k chahiye toh n-k remove krdo
    }
    public int[] removekdigits(int[] nums,int k){
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && k>0 && st.peek()>nums[i]){
                st.pop();
                k--;
            }
            st.push(nums[i]);
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        int[] ans=new int[st.size()];
        int i=ans.length-1;
        
        //no need to remove leading zeroes
        
        while(i>=0){
            ans[i--]=st.pop();
        }
        return ans;
    }
}