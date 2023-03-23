//BRUTE FORCE
//TC-0(Nlogn)  if we use arrays then it will n
//SC-O(N)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(nums[0]);
            return ans;
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);    //Nice method to increase frequency as we traverse
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>(nums.length/3)){
                ans.add(key);
            }
        }
        return ans;
    }
}