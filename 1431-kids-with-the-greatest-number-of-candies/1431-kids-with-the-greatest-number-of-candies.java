//TC-0(N)
//SC-0(N)
//BRUTE FORCE
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> ans=new ArrayList<>();
        
        for(int val:candies){
            if(val>max)     max=val;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}