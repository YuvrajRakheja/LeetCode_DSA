//TC-0(NLOGN)
//SC-0(N)
//BINARY SEARCH
class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxlen=1;
        
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        int len=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>ans.get(ans.size()-1)){
                ans.add(nums[i]);
                len++;
            }else{
                int idx=getidx(nums[i],ans);
                ans.set(idx,nums[i]);
            }
        }
        return len;
    }
    public int getidx(int num,ArrayList<Integer> ans){
        int left=0,right=ans.size()-1;
        
        while(left<=right){
            
            int mid=left+(right-left)/2;
            if(ans.get(mid)==num){
                return mid;
            }else if(ans.get(mid)>num){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;        
    }
}