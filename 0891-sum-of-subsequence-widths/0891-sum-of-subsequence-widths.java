//TC-0(NLOGN)
//SC-0(N)
class Solution {
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        
        long[] powerof2=new long[nums.length];
        powerof2[0]=1;
        for(int i=1;i<nums.length;i++){
            powerof2[i]=(powerof2[i-1]*2)%1000000007;
        }
        long answer=0;
        for(int i=0;i<nums.length;i++){
            //each number is max 2^i times and min 2^n-1-i times
            answer=(answer+nums[i]*(powerof2[i]-powerof2[nums.length-1-i]))%1000000007;
        }
        return (int)answer;
    }
}