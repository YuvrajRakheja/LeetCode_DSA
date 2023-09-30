class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),i);
        }
        int mini=1000;
        while(k>0){
            mini=Math.min(mini,map.get(k));
            k--;
        }
        return nums.size()-mini;
    }
}