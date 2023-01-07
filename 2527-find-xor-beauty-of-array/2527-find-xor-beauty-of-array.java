//TC-0(N)
//SC-0(1)
//BASICALLY XOR BEAUTY IS 3 TIMES EVERYTHING SO A^A^A=A AND ANSWER IS ZOR OF ALL XOR BEAUTY
class Solution {
    public int xorBeauty(int[] nums) {
        int ans=0;
        for(int n:nums){
            ans^=n;
        }
        return ans;
    }
}