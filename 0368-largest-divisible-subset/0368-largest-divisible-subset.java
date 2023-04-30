//TC-0(N^2)+0(N)
//SC-0(N)
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] dp=new int[nums.length];
        int[] hash=new int[nums.length];
        int lastindex=0;
        
        Arrays.fill(dp,1);
        Arrays.sort(nums);//now they r in increasing order
        
        
        int max=0;
        for(int i=1;i<nums.length;i++){
            hash[i]=i;
            
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                lastindex=i;
            }
        }
        ans.add(nums[lastindex]);
        while(lastindex!=hash[lastindex]){
            ans.add(nums[hash[lastindex]]);
            lastindex=hash[lastindex];
        }
        return ans;
    }
}